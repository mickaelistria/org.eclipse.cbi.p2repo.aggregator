package org.eclipse.b3.ui.outline;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreePathViewerSorter;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.search.ui.IContextMenuConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.ISourceViewerAware;
import org.eclipse.xtext.ui.editor.IXtextEditorAware;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNodeLabelProvider;
import org.eclipse.xtext.ui.editor.outline.IContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.IContentOutlineNodeComparer;
import org.eclipse.xtext.ui.editor.outline.IContentOutlineNodeForTextSelectionFinder;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.XtextContentOutlinePage;
import org.eclipse.xtext.ui.editor.outline.actions.ContentOutlineNodeAdapter;
import org.eclipse.xtext.ui.editor.outline.actions.IActionBarContributor;
import org.eclipse.xtext.ui.editor.outline.actions.IContentOutlineNodeAdapterFactory;
import org.eclipse.xtext.ui.editor.outline.linking.EditorSelectionChangedListener;
import org.eclipse.xtext.ui.editor.outline.linking.LinkingHelper;
import org.eclipse.xtext.ui.editor.outline.linking.OutlineSelectionChangedListener;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * VIEWER DISCRETION IS ADVICED - THIS IS AN UGLY HACK
 * 
 * THIS IS A HACKED COPY OF XtextContentOutlinePage because it has the following problems:
 * - it is not possible to externally refresh it
 * - a simple derivation with a public externalRefresh is not enough
 * - when a saveAs is performed, the modelListener is not reset, and the outline page continues to listen
 * to the previous model (and it stops updating)
 * - Unfortunately it is not possible to create an alternative implementation as the toolbar configurer
 * expects an instance of XtextContentOutlinePage
 * 
 */
public class RefreshableXtextContentOutlinePage extends XtextContentOutlinePage /* , ContentOutlinePage */implements
		ISourceViewerAware, IXtextEditorAware {
	protected static class DelegatorLabelProvider extends DelegatingStyledCellLabelProvider implements ILabelProvider {

		public DelegatorLabelProvider(IStyledLabelProvider labelProvider) {
			super(labelProvider);
		}

		public String getText(Object element) {
			StyledString styledText = getStyledText(element);
			return (styledText != null)
					? styledText.getString()
					: null;
		}
	}

	static final Logger logger = Logger.getLogger(XtextContentOutlinePage.class);

	@Inject
	private IOutlineTreeProvider contentProvider;

	@Inject
	private ContentOutlineNodeLabelProvider labelProvider;

	/**
	 * @deprecation see {@link IContentOutlineNodeAdapterFactory}
	 */
	@Deprecated
	@Inject(optional = true)
	private IContentOutlineNodeAdapterFactory outlineNodeAdapterFactory;

	@Inject
	private IActionBarContributor actionbarContributor;

	@Inject
	private IContentOutlineNodeComparer nodeComparer;

	private XtextEditor editor;

	private ISourceViewer sourceViewer;

	private OutlineSelectionChangedListener outlineSelectionChangedListener;

	private EditorSelectionChangedListener editorSelectionChangedListener;

	private IXtextModelListener modelListener;

	private Menu contextMenu;

	private static final String contextMenuID = "xtextOutlineContextMenu";

	private ViewerSorter sorter;

	@Inject
	private Provider<IContentOutlineNodeForTextSelectionFinder> nodeForTextSelectionFinderProvider;

	public RefreshableXtextContentOutlinePage() {
		// super's default constructor will be called and do the same - meaningless and wasteful
		sorter = createSorter();
	}

	@Override
	public void createControl(Composite parent) {
		// HACK: must call super as there is no other way to get to super.super.createControl
		super.createControl(parent);
	}

	@Override
	public void disableFilter(ViewerFilter filter) {
		if(getTreeViewer() != null) {
			getTreeViewer().removeFilter(filter);
		}
	}

	@Override
	public void dispose() {
		getTreeViewer().removeDoubleClickListener(outlineSelectionChangedListener);
		outlineSelectionChangedListener.uninstall(this);
		outlineSelectionChangedListener = null;
		editorSelectionChangedListener.uninstall(sourceViewer.getSelectionProvider());
		editorSelectionChangedListener = null;
		uninstallModelListener();
		if(editor != null) {
			editor.outlinePageClosed();
			editor = null;
		}
		contentProvider.dispose();
		contentProvider = null;

		// HACK : Does not work to call super.dispose() since everything in use was created by this class
		// the super version will try dispose of things never created
		// super.dispose();

		// HACK: this is what super.super.dispose() does
		Control ctrl = getControl();
		if(ctrl != null && !ctrl.isDisposed())
			ctrl.dispose();

	}

	@Override
	public void enableFilter(ViewerFilter filter) {
		if(getTreeViewer() != null) {
			ViewerFilter[] filters = getTreeViewer().getFilters();
			for(ViewerFilter viewerFilter : filters) {
				if(viewerFilter.equals(filter)) {
					return;
				}
			}
			getTreeViewer().addFilter(filter);
		}
	}

	/**
	 * Special method that should be called from performSavedAs
	 */
	public void externalRefresh() {
		// Must drop old listener (should ideally get rid of the listener, but since the document changed already (??)
		// it will probably not unregister for the correct document.
		modelListener = null;
		// Install a model listener for the current document
		installModelListener();
		refresh();
	}

	@Override
	public IXtextDocument getDocument() {
		return XtextDocumentUtil.get(getSourceViewer());
	}

	@Override
	public XtextEditor getEditor() {
		return editor;
	}

	@Override
	public ISourceViewer getSourceViewer() {
		return sourceViewer;
	}

	@Override
	public boolean isLinkingEnabled() {
		return LinkingHelper.isLinkingEnabled();
	}

	@Override
	public void setEditor(XtextEditor editor) {
		this.editor = editor;
	}

	@Override
	public void setLinkingEnabled(boolean enabled) {
		LinkingHelper.setLinkingEnabled(enabled);
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		if(getTreeViewer() != null) {
			getTreeViewer().setSelection(selection, reveal);
		}
	}

	@Override
	public void setSorted(boolean sorted) {
		if(getTreeViewer() != null) {
			if(sorted) {
				getTreeViewer().setSorter(sorter);
			}
			else {
				getTreeViewer().setSorter(null);
			}
		}
	}

	@Override
	public void setSourceViewer(ISourceViewer sourceViewer) {
		this.sourceViewer = sourceViewer;
		getOutlineSelectionListener().install(this);
		getEditorSelectionChangedListener().install(sourceViewer.getSelectionProvider());
	}

	@Override
	public void synchronizeOutlinePage() {
		if(isLinkingEnabled()) {
			final Point textSelection = getSourceViewer().getTextWidget().getSelection();
			if(!outlineSelectionRegionEqualsTextSelection(textSelection)) {
				IContentOutlineNodeForTextSelectionFinder nodeForTextSelectionFinder = nodeForTextSelectionFinderProvider.get();
				nodeForTextSelectionFinder.setTextSelection(textSelection);
				for(Object rootElement : contentProvider.getElements(null)) {
					if(rootElement instanceof IContentOutlineNode) {
						nodeForTextSelectionFinder.traverse((IContentOutlineNode) rootElement);
					}
				}
				IContentOutlineNode bestMatch = nodeForTextSelectionFinder.getBestMatch();
				if(bestMatch != null) {
					outlineSelectionChangedListener.uninstall(this);
					this.setSelection(new StructuredSelection(bestMatch), true);
					outlineSelectionChangedListener.install(this);
				}
			}
		}
	}

	/**
	 * @deprecated ContentOutlineNodeAdapter may not be initialised as the nodes are created lazyly.
	 *             See https://bugs.eclipse.org/bugs/show_bug.cgi?id=322656
	 */
	@Override
	@Deprecated
	public void synchronizeOutlinePage(EObject eObject) {
		if(isLinkingEnabled()) {
			IContentOutlineNode mostSignificantOutlineNode = findMostSignificantOutlineNode(eObject);
			if(mostSignificantOutlineNode != null) {
				outlineSelectionChangedListener.uninstall(this);
				this.setSelection(new StructuredSelection(mostSignificantOutlineNode), true);
				outlineSelectionChangedListener.install(this);
			}
		}
	}

	@Override
	protected void configureContextMenu() {
		MenuManager manager = new MenuManager(contextMenuID, contextMenuID);
		manager.setRemoveAllWhenShown(true);
		manager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		contextMenu = manager.createContextMenu(getTreeViewer().getTree());
		getTreeViewer().getTree().setMenu(contextMenu);

		IPageSite site = getSite();
		// TODO: remove on next API change
		if(outlineNodeAdapterFactory != null)
			Platform.getAdapterManager().registerAdapters(outlineNodeAdapterFactory, IContentOutlineNode.class);
		site.registerContextMenu("org.eclipse.xtext.ui" + ".outline", manager, getTreeViewer()); //$NON-NLS-1$
	}

	@Override
	protected void configureDocument() {
		if(sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);

			// TODO: it would be better to have NodeContentAdapter update the
			// parts of the outline model that need updates instead of
			// installing a model listener.

			installModelListener();

			internalSetInput(xtextDocument, true);
		}
	}

	@Override
	protected void configureProviders() {
		getTreeViewer().setContentProvider(contentProvider);
		getTreeViewer().setLabelProvider(new DelegatorLabelProvider(labelProvider));
	}

	@Override
	protected void configureViewer() {
		TreeViewer viewer = getTreeViewer();
		viewer.setAutoExpandLevel(getAutoExpandLevel());
		viewer.setUseHashlookup(false);
		viewer.setComparer(nodeComparer);
		viewer.addDoubleClickListener(getOutlineSelectionListener());
	}

	@Override
	protected ViewerSorter createSorter() {
		return new TreePathViewerSorter();
	}

	@Override
	protected void fillContextMenu(IMenuManager menu) {
		menu.add(new Separator(IContextMenuConstants.GROUP_ADDITIONS));
	}

	/**
	 * @deprecated ContentOutlineNodeAdapter may not be initialised as the nodes are created lazyly.
	 *             See https://bugs.eclipse.org/bugs/show_bug.cgi?id=322656
	 */
	@Override
	@Deprecated
	protected IContentOutlineNode findMostSignificantOutlineNode(EObject eObject) {
		if(eObject != null) {
			ContentOutlineNodeAdapter adapter = (ContentOutlineNodeAdapter) EcoreUtil.getAdapter(
				eObject.eAdapters(), IContentOutlineNode.class);
			if(adapter != null) {
				IContentOutlineNode contentOutlineNode = adapter.getContentOutlineNode();
				if(contentOutlineNode != null) {
					return contentOutlineNode;
				}
			}
			else {
				return findMostSignificantOutlineNode(eObject.eContainer());
			}
		}
		return null;
	}

	@Override
	protected int getAutoExpandLevel() {
		return 2;
	}

	@Override
	protected boolean outlineSelectionRegionEqualsTextSelection(final Point textSelection) {
		ITreeSelection outlineSelection = (ITreeSelection) getTreeViewer().getSelection();
		if(outlineSelection.size() == 1) {
			Object outlineSelectedElement = outlineSelection.getFirstElement();
			if(outlineSelectedElement instanceof IContentOutlineNode) {
				IRegion nodeRegion = ((IContentOutlineNode) outlineSelectedElement).getRegion();
				if(nodeRegion != null) {
					if(nodeRegion.getOffset() == textSelection.x &&
							nodeRegion.getOffset() + nodeRegion.getLength() == textSelection.y) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	protected void refresh() {
		runInSWTThread(new Runnable() {
			public void run() {
				TreeViewer tv = getTreeViewer();
				if(tv != null) {
					IDocument document = sourceViewer.getDocument();
					internalSetInput(XtextDocumentUtil.get(document), false);
					tv.refresh();
				}
			}
		});
	}

	@Override
	protected void registerToolbarActions(IActionBars actionBars) {
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		if(actionbarContributor != null) {
			actionbarContributor.init(toolBarManager, this);
		}
	}

	/**
	 * Runs the runnable in the SWT thread. (Simply runs the runnable if the current thread is the UI thread, otherwise
	 * calls the runnable in asyncexec.)
	 */
	@Override
	protected void runInSWTThread(Runnable runnable) {
		if(Display.getCurrent() == null) {
			Display.getDefault().asyncExec(runnable);
		}
		else {
			runnable.run();
		}
	}

	private EditorSelectionChangedListener getEditorSelectionChangedListener() {
		if(editorSelectionChangedListener == null) {
			editorSelectionChangedListener = new EditorSelectionChangedListener(this);
		}
		return editorSelectionChangedListener;
	}

	private OutlineSelectionChangedListener getOutlineSelectionListener() {
		if(outlineSelectionChangedListener == null) {
			outlineSelectionChangedListener = new OutlineSelectionChangedListener(this);
		}
		return outlineSelectionChangedListener;
	}

	private void installModelListener() {
		if(sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);
			if(xtextDocument != null) {
				if(modelListener == null) {
					modelListener = new IXtextModelListener() {
						public void modelChanged(XtextResource resource) {
							if(logger.isDebugEnabled()) {
								logger.debug("Document has been changed. Triggering update of outline.");
							}
							refresh();
						}
					};
				}
				xtextDocument.addModelListener(modelListener);
			}
		}
	}

	private void internalSetInput(IXtextDocument xtextDocument, boolean initial) {

		TreeViewer tree = getTreeViewer();
		if(tree != null) {
			Object[] expandedElements = null;
			expandedElements = tree.getExpandedElements();

			tree.setInput(xtextDocument);

			if(expandedElements != null && expandedElements.length > 0)
				tree.setExpandedElements(expandedElements);
		}
	}

	private void uninstallModelListener() {
		if(sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);
			if(xtextDocument != null) {
				xtextDocument.removeModelListener(modelListener);
			}
		}
	}

}

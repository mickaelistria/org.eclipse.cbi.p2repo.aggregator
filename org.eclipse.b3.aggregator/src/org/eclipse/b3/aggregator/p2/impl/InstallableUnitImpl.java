/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.p2.ArtifactKey;
import org.eclipse.b3.aggregator.p2.Copyright;
import org.eclipse.b3.aggregator.p2.InstallableUnit;
import org.eclipse.b3.aggregator.p2.License;
import org.eclipse.b3.aggregator.p2.P2Factory;
import org.eclipse.b3.aggregator.p2.P2Package;
import org.eclipse.b3.aggregator.p2.ProvidedCapability;
import org.eclipse.b3.aggregator.p2.Requirement;
import org.eclipse.b3.aggregator.p2.TouchpointData;
import org.eclipse.b3.aggregator.p2.TouchpointInstruction;
import org.eclipse.b3.aggregator.p2.TouchpointType;
import org.eclipse.b3.aggregator.p2.UpdateDescriptor;
import org.eclipse.b3.aggregator.util.InstallableUnitUtils;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.equinox.internal.p2.core.helpers.OrderedProperties;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.internal.p2.metadata.TranslationSupport;
import org.eclipse.equinox.internal.p2.metadata.VersionedId;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.ITouchpointData;
import org.eclipse.equinox.p2.metadata.ITouchpointInstruction;
import org.eclipse.equinox.p2.metadata.ITouchpointType;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;
import org.eclipse.equinox.p2.metadata.Version;
import org.osgi.framework.Filter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Installable Unit</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getFilter <em>Filter</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getId <em>Id</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getTouchpointType <em>Touchpoint Type</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#isFragment <em>Fragment</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#isResolved <em>Resolved</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#isSingleton <em>Singleton</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getUpdateDescriptor <em>Update Descriptor </em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getLicense <em>License</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getArtifactList <em>Artifact List</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getProvidedCapabilityList <em>Provided Capability
 * List</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getRequiredCapabilityList <em>Required Capability
 * List</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getMetaRequiredCapabilityList <em>Meta Required
 * Capability List</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getPropertyMap <em>Property Map</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl#getTouchpointDataList <em>Touchpoint Data List</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InstallableUnitImpl extends MinimalEObjectImpl.Container implements InstallableUnit {
	// Compares IU by id (ascending) and version (descending)
	public static class IUSelectionComparator implements Comparator<IInstallableUnit> {

		public int compare(IInstallableUnit iu1, IInstallableUnit iu2) {
			if(iu1 != null)
				if(iu2 == null)
					return 1;
				else {
					VersionedId vid1 = InstallableUnitUtils.getVersionedName((InstallableUnit) iu1);
					VersionedId vid2 = InstallableUnitUtils.getVersionedName((InstallableUnit) iu2);

					String id1 = vid1.getId();
					String id2 = vid2.getId();

					if(id1 != null)
						if(id2 == null)
							return 1;
						else {
							int result = id1.toLowerCase().compareTo(id2.toLowerCase());

							if(result == 0) {
								// Order by version in descending order
								Version version1 = vid1.getVersion();
								Version version2 = vid2.getVersion();

								if(version1 != null)
									if(version2 == null)
										return -1;
									else
										return -version1.compareTo(version2);
								else if(version2 != null)
									return 1;
								else
									return 0;
							}

							return result;
						}
					else if(id2 != null)
						return -1;
					else
						return 0;
				}
			else if(iu2 != null)
				return -1;
			else
				return 0;
		}
	}

	public static Comparator<IInstallableUnit> SELECTION_COMPARATOR = new IUSelectionComparator();

	public static Copyright importToModel(ICopyright cr) {
		if(cr == null)
			return null;
		CopyrightImpl mcr = (CopyrightImpl) P2Factory.eINSTANCE.createCopyright();
		mcr.setBody(cr.getBody());
		mcr.setLocation(cr.getLocation());
		return mcr;
	}

	public static License importToModel(ILicense lc) {
		if(lc == null)
			return null;
		LicenseImpl mlc = (LicenseImpl) P2Factory.eINSTANCE.createLicense();
		mlc.setBody(lc.getBody());
		mlc.setUUID(lc.getUUID());
		mlc.setLocation(lc.getLocation());
		return mlc;
	}

	public static ProvidedCapability importToModel(IProvidedCapability pc) {
		if(pc == null)
			return null;
		ProvidedCapabilityImpl mrq = (ProvidedCapabilityImpl) P2Factory.eINSTANCE.createProvidedCapability();
		mrq.setName(pc.getName());
		mrq.setNamespace(pc.getNamespace());
		mrq.setVersion(pc.getVersion());
		return mrq;
	}

	public static Requirement importToModel(IRequirement req) {
		if(req == null)
			return null;
		if(req instanceof IRequiredCapability) {
			IRequiredCapability rc = (IRequiredCapability) req;
			RequiredCapabilityImpl mrc = (RequiredCapabilityImpl) P2Factory.eINSTANCE.createRequiredCapability();
			mrc.setFilter(req.getFilter());
			mrc.setGreedy(req.isGreedy());
			mrc.setMin(req.getMin());
			mrc.setMax(req.getMax());
			mrc.setName(rc.getName());
			mrc.setNamespace(rc.getNamespace());
			mrc.setRange(rc.getRange());

			return mrc;
		}
		else {
			RequirementImpl mreq = (RequirementImpl) P2Factory.eINSTANCE.createRequirement();
			mreq.setFilter(req.getFilter());
			mreq.setGreedy(req.isGreedy());
			mreq.setMin(req.getMin());
			mreq.setMax(req.getMax());

			return mreq;
		}
	}

	public static TouchpointData importToModel(ITouchpointData ptd) {
		if(ptd == null)
			return null;
		TouchpointData mtpd = P2Factory.eINSTANCE.createTouchpointData();
		EMap<String, ITouchpointInstruction> minstrMap = mtpd.getInstructionMap();
		Map<String, ITouchpointInstruction> instrMap = ptd.getInstructions();
		for(Map.Entry<String, ITouchpointInstruction> instr : instrMap.entrySet())
			minstrMap.put(instr.getKey(), importToModel(instr.getValue()));
		return mtpd;
	}

	public static TouchpointInstruction importToModel(ITouchpointInstruction ti) {
		if(ti == null)
			return null;
		TouchpointInstructionImpl mti = (TouchpointInstructionImpl) P2Factory.eINSTANCE.createTouchpointInstruction();
		mti.setBody(ti.getBody());
		mti.setImportAttribute(ti.getImportAttribute());
		return mti;
	}

	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected int eFlags = 0;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	public static InstallableUnit importToModel(IInstallableUnit iu) {
		if(iu == null)
			return null;

		P2Factory factory = P2Factory.eINSTANCE;
		InstallableUnitImpl miu;
		if(iu instanceof IInstallableUnitFragment) {
			InstallableUnitFragmentImpl miuf = (InstallableUnitFragmentImpl) factory.createInstallableUnitFragment();
			List<Requirement> mhosts = miuf.getHostList();
			for(IRequirement host : ((IInstallableUnitFragment) iu).getHost())
				mhosts.add(importToModel(host));
			miu = miuf;
		}
		else
			miu = (InstallableUnitImpl) factory.createInstallableUnit();

		miu.setCopyright(importToModel(iu.getCopyright()));
		miu.setFilter(iu.getFilter());
		miu.setId(iu.getId());
		for(ILicense license : iu.getLicenses())
			miu.getLicenses().add(importToModel(license));
		miu.setResolved(iu.isResolved());
		miu.setSingleton(iu.isSingleton());
		miu.setTouchpointType(importToModel(iu.getTouchpointType()));
		miu.setUpdateDescriptor(importToModel(iu.getUpdateDescriptor()));
		miu.setVersion(iu.getVersion());

		Map<String, String> props = iu.getProperties();
		if(props.size() > 0)
			miu.getPropertyMap().putAll(props);

		List<IArtifactKey> keys = miu.getArtifacts();
		for(IArtifactKey key : iu.getArtifacts())
			keys.add(importToModel(key));

		List<IRequirement> reqs = miu.getMetaRequiredCapabilities();
		for(IRequirement req : iu.getMetaRequiredCapabilities())
			reqs.add(importToModel(req));

		reqs = miu.getRequiredCapabilities();
		for(IRequirement rc : iu.getRequiredCapabilities())
			reqs.add(importToModel(rc));

		List<IProvidedCapability> pcs = miu.getProvidedCapabilities();
		for(IProvidedCapability pc : iu.getProvidedCapabilities())
			pcs.add(importToModel(pc));

		List<ITouchpointData> tds = miu.getTouchpointData();
		for(ITouchpointData td : iu.getTouchpointData())
			tds.add(importToModel(td));

		return miu;
	}

	public static TouchpointType importToModel(ITouchpointType tpt) {
		if(tpt == null)
			return null;
		TouchpointTypeImpl mtpt = (TouchpointTypeImpl) P2Factory.eINSTANCE.createTouchpointType();
		mtpt.setId(tpt.getId());
		mtpt.setVersion(tpt.getVersion());
		return mtpt;
	}

	public static UpdateDescriptor importToModel(IUpdateDescriptor ud) {
		if(ud == null)
			return null;
		UpdateDescriptorImpl mud = (UpdateDescriptorImpl) P2Factory.eINSTANCE.createUpdateDescriptor();
		mud.setDescription(ud.getDescription());
		mud.setId(ud.getId());
		mud.setRange(ud.getRange());
		mud.setSeverity(ud.getSeverity());
		return mud;
	}

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	public static ArtifactKey importToModel(IArtifactKey key) {
		if(key == null)
			return null;
		ArtifactKeyImpl mkey = (ArtifactKeyImpl) P2Factory.eINSTANCE.createArtifactKey();
		mkey.setClassifier(key.getClassifier());
		mkey.setId(key.getId());
		mkey.setVersion(key.getVersion());
		return mkey;
	}

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<IArtifactKey> artifacts;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected ICopyright copyright;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final Filter FILTER_EDEFAULT = (Filter) P2Factory.eINSTANCE.createFromString(
			P2Package.eINSTANCE.getFilter(), "");

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter = FILTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<IInstallableUnitFragment> fragments;

	/**
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected EList<ILicense> licenses;

	/**
	 * The cached value of the '{@link #getMetaRequiredCapabilities() <em>Meta Required Capabilities</em>}' containment
	 * reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMetaRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<IRequirement> metaRequiredCapabilities;

	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<IProvidedCapability> providedCapabilities;

	/**
	 * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<IRequirement> requiredCapabilities;

	/**
	 * The cached value of the '{@link #getTouchpointData() <em>Touchpoint Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTouchpointData()
	 * @generated
	 * @ordered
	 */
	protected EList<ITouchpointData> touchpointData;

	/**
	 * The cached value of the '{@link #getTouchpointType() <em>Touchpoint Type</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTouchpointType()
	 * @generated
	 * @ordered
	 */
	protected ITouchpointType touchpointType;

	/**
	 * The cached value of the '{@link #getUpdateDescriptor() <em>Update Descriptor</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUpdateDescriptor()
	 * @generated
	 * @ordered
	 */
	protected IUpdateDescriptor updateDescriptor;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOLVED_EFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final int SINGLETON_EFLAG = 1 << 1;

	/**
	 * The cached value of the '{@link #getPropertyMap() <em>Property Map</em>}' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPropertyMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> propertyMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstallableUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCopyright(ICopyright newCopyright, NotificationChain msgs) {
		ICopyright oldCopyright = copyright;
		copyright = newCopyright;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					P2Package.INSTALLABLE_UNIT__COPYRIGHT, oldCopyright, newCopyright);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTouchpointType(ITouchpointType newTouchpointType, NotificationChain msgs) {
		ITouchpointType oldTouchpointType = touchpointType;
		touchpointType = newTouchpointType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE, oldTouchpointType, newTouchpointType);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetUpdateDescriptor(IUpdateDescriptor newUpdateDescriptor, NotificationChain msgs) {
		IUpdateDescriptor oldUpdateDescriptor = updateDescriptor;
		updateDescriptor = newUpdateDescriptor;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR, oldUpdateDescriptor, newUpdateDescriptor);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int compareTo(IInstallableUnit other) {
		int idCmp = getId().compareTo(other.getId());
		return idCmp == 0
				? getVersion().compareTo(other.getVersion())
				: idCmp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case P2Package.INSTALLABLE_UNIT__ID:
			return getId();
		case P2Package.INSTALLABLE_UNIT__VERSION:
			return getVersion();
		case P2Package.INSTALLABLE_UNIT__ARTIFACTS:
			return getArtifacts();
		case P2Package.INSTALLABLE_UNIT__COPYRIGHT:
			return getCopyright();
		case P2Package.INSTALLABLE_UNIT__FILTER:
			return getFilter();
		case P2Package.INSTALLABLE_UNIT__FRAGMENTS:
			return getFragments();
		case P2Package.INSTALLABLE_UNIT__LICENSES:
			return getLicenses();
		case P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES:
			return getMetaRequiredCapabilities();
		case P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES:
			return getProvidedCapabilities();
		case P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES:
			return getRequiredCapabilities();
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA:
			return getTouchpointData();
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE:
			return getTouchpointType();
		case P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR:
			return getUpdateDescriptor();
		case P2Package.INSTALLABLE_UNIT__RESOLVED:
			return isResolved();
		case P2Package.INSTALLABLE_UNIT__SINGLETON:
			return isSingleton();
		case P2Package.INSTALLABLE_UNIT__PROPERTY_MAP:
			if(coreType)
				return getPropertyMap();
			else
				return getPropertyMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case P2Package.INSTALLABLE_UNIT__ARTIFACTS:
			return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__COPYRIGHT:
			return basicSetCopyright(null, msgs);
		case P2Package.INSTALLABLE_UNIT__LICENSES:
			return ((InternalEList<?>) getLicenses()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES:
			return ((InternalEList<?>) getMetaRequiredCapabilities()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES:
			return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES:
			return ((InternalEList<?>) getRequiredCapabilities()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA:
			return ((InternalEList<?>) getTouchpointData()).basicRemove(otherEnd, msgs);
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE:
			return basicSetTouchpointType(null, msgs);
		case P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR:
			return basicSetUpdateDescriptor(null, msgs);
		case P2Package.INSTALLABLE_UNIT__PROPERTY_MAP:
			return ((InternalEList<?>) getPropertyMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case P2Package.INSTALLABLE_UNIT__ID:
			return ID_EDEFAULT == null
					? id != null
					: !ID_EDEFAULT.equals(id);
		case P2Package.INSTALLABLE_UNIT__VERSION:
			return VERSION_EDEFAULT == null
					? version != null
					: !VERSION_EDEFAULT.equals(version);
		case P2Package.INSTALLABLE_UNIT__ARTIFACTS:
			return artifacts != null && !artifacts.isEmpty();
		case P2Package.INSTALLABLE_UNIT__COPYRIGHT:
			return copyright != null;
		case P2Package.INSTALLABLE_UNIT__FILTER:
			return FILTER_EDEFAULT == null
					? filter != null
					: !FILTER_EDEFAULT.equals(filter);
		case P2Package.INSTALLABLE_UNIT__FRAGMENTS:
			return fragments != null && !fragments.isEmpty();
		case P2Package.INSTALLABLE_UNIT__LICENSES:
			return licenses != null && !licenses.isEmpty();
		case P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES:
			return metaRequiredCapabilities != null && !metaRequiredCapabilities.isEmpty();
		case P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES:
			return providedCapabilities != null && !providedCapabilities.isEmpty();
		case P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES:
			return requiredCapabilities != null && !requiredCapabilities.isEmpty();
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA:
			return touchpointData != null && !touchpointData.isEmpty();
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE:
			return touchpointType != null;
		case P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR:
			return updateDescriptor != null;
		case P2Package.INSTALLABLE_UNIT__RESOLVED:
			return ((eFlags & RESOLVED_EFLAG) != 0) != RESOLVED_EDEFAULT;
		case P2Package.INSTALLABLE_UNIT__SINGLETON:
			return ((eFlags & SINGLETON_EFLAG) != 0) != SINGLETON_EDEFAULT;
		case P2Package.INSTALLABLE_UNIT__PROPERTY_MAP:
			return propertyMap != null && !propertyMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof IInstallableUnit))
			return false;
		final IInstallableUnit other = (IInstallableUnit) obj;
		String thisId = StringUtils.trimmedOrNull(id);
		String otherId = StringUtils.trimmedOrNull(other.getId());

		if(thisId == null) {
			if(otherId != null)
				return false;
		}
		else if(!thisId.equals(otherId))
			return false;
		if(getVersion() == null) {
			if(other.getVersion() != null)
				return false;

			if(other instanceof InstallableUnitImpl) {
				VersionedId thisVn = InstallableUnitUtils.getVersionedNameFromProxy(this);
				VersionedId otherVn = InstallableUnitUtils.getVersionedNameFromProxy((InstallableUnit) other);

				if(thisVn == null) {
					if(otherVn != null)
						return false;
				}
				else if(!thisVn.equals(otherVn))
					return false;
			}
		}
		else if(!getVersion().equals(other.getVersion()))
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case P2Package.INSTALLABLE_UNIT__ID:
			setId((String) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__VERSION:
			setVersion((Version) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__ARTIFACTS:
			getArtifacts().clear();
			getArtifacts().addAll((Collection<? extends IArtifactKey>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__COPYRIGHT:
			setCopyright((ICopyright) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__FILTER:
			setFilter((Filter) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__FRAGMENTS:
			getFragments().clear();
			getFragments().addAll((Collection<? extends IInstallableUnitFragment>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__LICENSES:
			getLicenses().clear();
			getLicenses().addAll((Collection<? extends ILicense>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES:
			getMetaRequiredCapabilities().clear();
			getMetaRequiredCapabilities().addAll((Collection<? extends IRequirement>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES:
			getProvidedCapabilities().clear();
			getProvidedCapabilities().addAll((Collection<? extends IProvidedCapability>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES:
			getRequiredCapabilities().clear();
			getRequiredCapabilities().addAll((Collection<? extends IRequirement>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA:
			getTouchpointData().clear();
			getTouchpointData().addAll((Collection<? extends ITouchpointData>) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE:
			setTouchpointType((ITouchpointType) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__RESOLVED:
			setResolved((Boolean) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__SINGLETON:
			setSingleton((Boolean) newValue);
			return;
		case P2Package.INSTALLABLE_UNIT__PROPERTY_MAP:
			((EStructuralFeature.Setting) getPropertyMap()).set(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case P2Package.INSTALLABLE_UNIT__ID:
			setId(ID_EDEFAULT);
			return;
		case P2Package.INSTALLABLE_UNIT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case P2Package.INSTALLABLE_UNIT__ARTIFACTS:
			getArtifacts().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__COPYRIGHT:
			setCopyright((ICopyright) null);
			return;
		case P2Package.INSTALLABLE_UNIT__FILTER:
			setFilter(FILTER_EDEFAULT);
			return;
		case P2Package.INSTALLABLE_UNIT__FRAGMENTS:
			getFragments().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__LICENSES:
			getLicenses().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES:
			getMetaRequiredCapabilities().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES:
			getProvidedCapabilities().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES:
			getRequiredCapabilities().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA:
			getTouchpointData().clear();
			return;
		case P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE:
			setTouchpointType((ITouchpointType) null);
			return;
		case P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) null);
			return;
		case P2Package.INSTALLABLE_UNIT__RESOLVED:
			setResolved(RESOLVED_EDEFAULT);
			return;
		case P2Package.INSTALLABLE_UNIT__SINGLETON:
			setSingleton(SINGLETON_EDEFAULT);
			return;
		case P2Package.INSTALLABLE_UNIT__PROPERTY_MAP:
			getPropertyMap().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IArtifactKey> getArtifacts() {
		if(artifacts == null) {
			artifacts = new EObjectContainmentEList<IArtifactKey>(IArtifactKey.class, this,
					P2Package.INSTALLABLE_UNIT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ICopyright getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ICopyright getCopyright(String locale) {
		return TranslationSupport.getInstance().getCopyright(this, locale);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Filter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IInstallableUnitFragment> getFragments() {
		if(fragments == null) {
			fragments = new EObjectResolvingEList<IInstallableUnitFragment>(IInstallableUnitFragment.class, this,
					P2Package.INSTALLABLE_UNIT__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ILicense> getLicenses() {
		if(licenses == null) {
			licenses = new EObjectContainmentEList<ILicense>(ILicense.class, this, P2Package.INSTALLABLE_UNIT__LICENSES);
		}
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ILicense[] getLicenses(String locale) {
		return TranslationSupport.getInstance().getLicenses(this, locale);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IRequirement> getMetaRequiredCapabilities() {
		if(metaRequiredCapabilities == null) {
			metaRequiredCapabilities = new EObjectContainmentEList<IRequirement>(IRequirement.class, this,
					P2Package.INSTALLABLE_UNIT__META_REQUIRED_CAPABILITIES);
		}
		return metaRequiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Map<String, String> getProperties() {
		// Retain the order of the properties
		//
		EMap<String, String> propertyEntries = getPropertyMap();
		int top = propertyEntries.size();
		if(top == 0)
			return Collections.emptyMap();

		if(top == 1) {
			Map.Entry<String, String> entry = propertyEntries.get(0);
			return Collections.singletonMap(entry.getKey(), entry.getValue());
		}

		OrderedProperties props = new OrderedProperties(top);
		for(int idx = 0; idx < top; ++idx) {
			Map.Entry<String, String> entry = propertyEntries.get(idx);
			props.put(entry.getKey(), entry.getValue());
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getProperty(String key) {
		return getPropertyMap().get(key);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getProperty(String key, String locale) {
		return TranslationSupport.getInstance().getIUProperty(this, key, locale);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getPropertyMap() {
		if(propertyMap == null) {
			propertyMap = new EcoreEMap<String, String>(P2Package.Literals.PROPERTY, PropertyImpl.class, this,
					P2Package.INSTALLABLE_UNIT__PROPERTY_MAP);
		}
		return propertyMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IProvidedCapability> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<IProvidedCapability>(IProvidedCapability.class, this,
					P2Package.INSTALLABLE_UNIT__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IRequirement> getRequiredCapabilities() {
		if(requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentEList<IRequirement>(IRequirement.class, this,
					P2Package.INSTALLABLE_UNIT__REQUIRED_CAPABILITIES);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ITouchpointData> getTouchpointData() {
		if(touchpointData == null) {
			touchpointData = new EObjectContainmentEList<ITouchpointData>(ITouchpointData.class, this,
					P2Package.INSTALLABLE_UNIT__TOUCHPOINT_DATA);
		}
		return touchpointData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ITouchpointType getTouchpointType() {
		return touchpointType != null
				? touchpointType
				: eIsProxy()
						? null
						: ITouchpointType.NONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IUpdateDescriptor getUpdateDescriptor() {
		return updateDescriptor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null)
				? 0
				: id.hashCode());
		result = prime * result + ((getVersion() == null)
				? 0
				: getVersion().hashCode());
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isFragment() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isResolved() {
		return (eFlags & RESOLVED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSingleton() {
		return (eFlags & SINGLETON_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean satisfies(IRequirement candidate) {
		return candidate.isMatch(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopyright(ICopyright newCopyright) {
		if(newCopyright != copyright) {
			NotificationChain msgs = null;
			if(copyright != null)
				msgs = ((InternalEObject) copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__COPYRIGHT, null, msgs);
			if(newCopyright != null)
				msgs = ((InternalEObject) newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__COPYRIGHT, newCopyright,
					newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFilter(Filter newFilter) {
		Filter oldFilter = filter;
		filter = newFilter;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = (eFlags & RESOLVED_EFLAG) != 0;
		if(newResolved)
			eFlags |= RESOLVED_EFLAG;
		else
			eFlags &= ~RESOLVED_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__RESOLVED, oldResolved,
					newResolved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = (eFlags & SINGLETON_EFLAG) != 0;
		if(newSingleton)
			eFlags |= SINGLETON_EFLAG;
		else
			eFlags &= ~SINGLETON_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__SINGLETON, oldSingleton,
					newSingleton));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setTouchpointType(ITouchpointType newTouchpointType) {
		if(newTouchpointType == ITouchpointType.NONE)
			newTouchpointType = null;
		setTouchpointTypeGen(newTouchpointType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTouchpointTypeGen(ITouchpointType newTouchpointType) {
		if(newTouchpointType != touchpointType) {
			NotificationChain msgs = null;
			if(touchpointType != null)
				msgs = ((InternalEObject) touchpointType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE, null, msgs);
			if(newTouchpointType != null)
				msgs = ((InternalEObject) newTouchpointType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE, null, msgs);
			msgs = basicSetTouchpointType(newTouchpointType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__TOUCHPOINT_TYPE,
					newTouchpointType, newTouchpointType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUpdateDescriptor(IUpdateDescriptor newUpdateDescriptor) {
		if(newUpdateDescriptor != updateDescriptor) {
			NotificationChain msgs = null;
			if(updateDescriptor != null)
				msgs = ((InternalEObject) updateDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR, null, msgs);
			if(newUpdateDescriptor != null)
				msgs = ((InternalEObject) newUpdateDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR, null, msgs);
			msgs = basicSetUpdateDescriptor(newUpdateDescriptor, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__UPDATE_DESCRIPTOR,
					newUpdateDescriptor, newUpdateDescriptor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.INSTALLABLE_UNIT__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", filter: ");
		result.append(filter);
		result.append(", resolved: ");
		result.append((eFlags & RESOLVED_EFLAG) != 0);
		result.append(", singleton: ");
		result.append((eFlags & SINGLETON_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IInstallableUnit unresolved() {
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2Package.Literals.INSTALLABLE_UNIT;
	}

} // InstallableUnitImpl

package org.eclipse.b3.aggregator.util;

import org.eclipse.emf.common.util.URI;

public class VerificationDiagnostic extends ResourceDiagnosticImpl {

	public static final String ATTR_VERIFICATION_TYPE = "p2.verification.error.type";

	public static int MISSING_IU = 0;

	public static int CONFLICTING_IU = 1;

	protected int code;

	protected URI locationURI;

	protected Object additionalData;

	public VerificationDiagnostic(String message, URI locationURI, int code) {
		this(message, locationURI, code, null);
	}

	public VerificationDiagnostic(String message, URI locationURI, int code, Object additionalData) {
		super(message, locationURI.toString());
		this.message = message;
		this.locationURI = locationURI;
		this.code = code;
		this.additionalData = additionalData;
	}

	public Object getAdditionalData() {
		return additionalData;
	}

	public int getCode() {
		return code;
	}

	public void resolveLocation(URI base) {
		URI newLocationURI = locationURI.resolve(base);
		if(newLocationURI != locationURI) {
			location = newLocationURI.toString();
			locationURI = newLocationURI;
		}
	}

}

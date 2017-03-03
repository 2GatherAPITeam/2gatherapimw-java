package il.ac.shenkar.mwclient.services;

import il.ac.shenkar.mwclient.enums.InputSource;
import il.ac.shenkar.mwclient.models.MWRequest;

public class RequestSourceIdentifier {

	private static RequestSourceIdentifier requestSourceIdentifier = new RequestSourceIdentifier();

	public static RequestSourceIdentifier getInstance() {
		return requestSourceIdentifier;
	}

	private RequestSourceIdentifier() {}

	public InputSource identifyRequestSource(MWRequest mwRequest) {
		return null;
	}
}

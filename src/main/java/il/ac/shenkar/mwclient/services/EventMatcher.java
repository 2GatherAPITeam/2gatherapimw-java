package il.ac.shenkar.mwclient.services;

import il.ac.shenkar.mwclient.inputs.InputTranslator;
import il.ac.shenkar.mwclient.inputs.InputTranslatorMatcher;
import il.ac.shenkar.mwclient.models.MWRequest;
import il.ac.shenkar.mwclient.models.MWResponse;

public class EventMatcher {

	private InputTranslatorMatcher inputTranslatorMatcher;

	private static EventMatcher eventMatcher = new EventMatcher();

	public static EventMatcher getInstance() {
		return eventMatcher;
	}

	private EventMatcher() {
		this.inputTranslatorMatcher = InputTranslatorMatcher.getInstance();
	}

	public MWResponse translateActionFromEvent(MWRequest mwRequest) {
		InputTranslator inputTranslator = inputTranslatorMatcher.getRelevantInput(mwRequest);
		return inputTranslator.translateRequest(mwRequest);
	}
}
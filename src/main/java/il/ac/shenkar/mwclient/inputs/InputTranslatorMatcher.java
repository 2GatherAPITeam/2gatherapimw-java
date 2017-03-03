package il.ac.shenkar.mwclient.inputs;

import il.ac.shenkar.mwclient.enums.InputSource;
import il.ac.shenkar.mwclient.inputs.impl.ClickerInputTranslatorImpl;
import il.ac.shenkar.mwclient.inputs.impl.TobiiInputTranslatorImpl;
import il.ac.shenkar.mwclient.models.MWRequest;
import il.ac.shenkar.mwclient.services.RequestSourceIdentifier;

import java.util.Map;

public class InputTranslatorMatcher {

	private Map<InputSource, InputTranslator> inputTranslatorMap;
	private RequestSourceIdentifier requestSourceIdentifier;

	private static InputTranslatorMatcher inputTranslatorMatcher = new InputTranslatorMatcher();

	public static InputTranslatorMatcher getInstance() {
		return inputTranslatorMatcher;
	}

	private InputTranslatorMatcher() {
		requestSourceIdentifier = RequestSourceIdentifier.getInstance();
		inputTranslatorMap.put(InputSource.TOBII, TobiiInputTranslatorImpl.getInstance());
		inputTranslatorMap.put(InputSource.CLICKER, ClickerInputTranslatorImpl.getInstance());
	}

	public InputTranslator getRelevantInput(MWRequest mwRequest) {
		return inputTranslatorMap.get(requestSourceIdentifier.identifyRequestSource(mwRequest));
	}
}

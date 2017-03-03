package il.ac.shenkar.mwclient.inputs;

import il.ac.shenkar.mwclient.models.MWRequest;
import il.ac.shenkar.mwclient.models.MWResponse;

public interface InputTranslator {

	MWResponse translateRequest(MWRequest mwRequest);
}

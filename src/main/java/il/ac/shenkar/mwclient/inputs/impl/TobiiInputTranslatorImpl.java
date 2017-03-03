package il.ac.shenkar.mwclient.inputs.impl;

import il.ac.shenkar.mwclient.daos.InputConfigurationDao;
import il.ac.shenkar.mwclient.enums.InputSource;
import il.ac.shenkar.mwclient.inputs.InputTranslator;
import il.ac.shenkar.mwclient.models.InputConfiguration;
import il.ac.shenkar.mwclient.models.MWRequest;
import il.ac.shenkar.mwclient.models.MWResponse;

public class TobiiInputTranslatorImpl implements InputTranslator{

	private InputConfigurationDao inputConfigurationDao;
	private InputConfiguration inputConfiguration;

	private static TobiiInputTranslatorImpl tobiiInputTranslator = new TobiiInputTranslatorImpl();

	public static TobiiInputTranslatorImpl getInstance() {
		return tobiiInputTranslator;
	}

	private TobiiInputTranslatorImpl() {
		this.inputConfigurationDao = InputConfigurationDao.getInstance();
		this.inputConfiguration = inputConfigurationDao.getInputConfigurationByInputConfigurationId(InputSource.TOBII.ordinal());
	}

	public MWResponse translateRequest(MWRequest mwRequest) {
		return null;
	}
}

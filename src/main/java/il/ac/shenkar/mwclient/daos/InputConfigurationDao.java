package il.ac.shenkar.mwclient.daos;

import il.ac.shenkar.mwclient.models.InputConfiguration;

public class InputConfigurationDao {

	private static InputConfigurationDao inputConfigurationDao = new InputConfigurationDao();

	public static InputConfigurationDao getInstance() {
		return inputConfigurationDao;
	}

	private InputConfigurationDao() {
	}

	public InputConfiguration getInputConfigurationByInputConfigurationId(int inputConfigurationId) {
		return null;
	}

	public void saveNewInputConfiguration(InputConfiguration inputConfiguration) {

	}

	public void updateInputConfiguration(InputConfiguration inputConfiguration) {

	}

	public void deleteInputConfiguration(int inputConfigurationId) {

	}
}
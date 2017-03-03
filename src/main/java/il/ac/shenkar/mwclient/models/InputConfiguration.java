package il.ac.shenkar.mwclient.models;

import java.util.Map;

public class InputConfiguration {

	private int id;
	private String name;
	private Map<String, String> configurations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getConfigurations() {
		return configurations;
	}

	public void setConfigurations(Map<String, String> configurations) {
		this.configurations = configurations;
	}

	@Override public String toString() {
		return "InputConfiguration{" + "id=" + id + ", name='" + name + '\'' + ", configurations=" + configurations + '}';
	}
}
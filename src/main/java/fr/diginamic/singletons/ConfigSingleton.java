package fr.diginamic.singletons;

import java.util.ResourceBundle;

public class ConfigSingleton {

	private static ResourceBundle configuration;
	
	public static ConfigSingleton instance = null;
	
	private ConfigSingleton() {
		configuration = ResourceBundle.getBundle("configuration");
	}
	
	public static ConfigSingleton getInstance() {
		if (instance == null) {
			instance = new ConfigSingleton();
		}
		return instance;
	}
	
	public String getParam(String param) {
		return configuration.getString(param);
	}
}

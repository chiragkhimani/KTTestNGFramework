package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	public static void initProperty() {
		try {
			FileReader reader = new FileReader("src//test//resources//data//data.properties");
			prop.load(reader);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}

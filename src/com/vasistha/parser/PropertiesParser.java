package com.vasistha.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesParser {

	public Map<String, String> propertiesToMap(String filePath) throws IOException {
		FileReader reader = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(reader);
		Map<String, String> propertiesValue = new HashMap<>();
		for (Object key : prop.keySet()) {
			propertiesValue.put(key.toString().trim(), prop.getProperty((String) key).trim());
		}
		return propertiesValue;
	}

}

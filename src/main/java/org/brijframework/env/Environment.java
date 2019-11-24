package org.brijframework.env;

import java.util.Properties;

import org.brijframework.lifecycle.Initializer;

public interface Environment extends Initializer{

	void setProperties(Properties properties);

	Properties getProperties();

	String getName();

	boolean isActive();

	String get(String key);

	
}

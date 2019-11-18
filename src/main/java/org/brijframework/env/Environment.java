package org.brijframework.env;

import java.util.Map;
import java.util.Properties;

import org.brijframework.lifecycle.Initializer;

public interface Environment extends Initializer, Map<Object, Object>{

	void setProperties(Properties properties);

}

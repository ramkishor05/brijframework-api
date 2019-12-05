package org.brijframework.processor;

import org.brijframework.lifecycle.Finalizer;
import org.brijframework.lifecycle.Initializer;

public interface Processor extends Initializer, Finalizer{

	public void preInitializer(Object value);
	
	public void postInitializer(Object value);

	public void preProperty(String key, Object value);
	
	public void postProperty(String key, Object value);
	
	public void preFinalizer(Object value);
	
}

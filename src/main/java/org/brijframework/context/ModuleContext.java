package org.brijframework.context;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.container.Container;

public interface ModuleContext  extends Context{

	/**
	 * Return the Container map of context, or {@code null} if there is no parent and this
	 * is the root of the context hierarchy.
	 * 
	 * @return the parent context, or {@code null} if there is no parent
	 */
	public ConcurrentHashMap<Object, Container> getContainers();
	
}

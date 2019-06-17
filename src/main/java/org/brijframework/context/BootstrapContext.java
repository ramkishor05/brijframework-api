package org.brijframework.context;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.config.EnvConfigration;

public interface BootstrapContext extends Context{

	/**
	 * Return the sub context of context, or {@code null} if there is no parent and this
	 * is the root of the context hierarchy.
	 * 
	 * @return the parent context, or {@code null} if there is no parent
	 */
	public ConcurrentHashMap<Object, Context> getContexts();
	
	public EnvConfigration getConfigration();
}

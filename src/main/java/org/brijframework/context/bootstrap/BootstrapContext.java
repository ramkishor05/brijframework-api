package org.brijframework.context.bootstrap;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.container.bootstrap.BootstrapContainer;
import org.brijframework.context.Context;
import org.brijframework.context.module.ModuleContext;

public interface BootstrapContext extends Context{

	/**
	 * Return the sub context of context, or {@code null} if there is no parent and this
	 * is the root of the context hierarchy.
	 * 
	 * @return the parent context, or {@code null} if there is no parent
	 */
	public ConcurrentHashMap<Object, BootstrapContainer> getContainers();
	
	public void prestart( BootstrapContainer container) ;
	
	public void poststart( BootstrapContainer container) ;

	ModuleContext getModuleContext(Class<? extends ModuleContext> moduleContextCls);
	
}

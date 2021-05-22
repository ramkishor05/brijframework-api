package org.brijframework.context;

import org.brijframework.env.Environment;
import org.brijframework.lifecycle.Initializer;

public interface Context extends Initializer {
	
	public void initialize(Context context) ;
	
	/**
	 * this is load and start root internal process of the context hierarchy.
	 * 
	 */
	public void start();

	/**
	 * this is release root internal process of the context hierarchy.
	 * 
	 */
	public void stop();

	/**
	 * Return the parent context, or {@code null} if there is no parent and this
	 * is the root of the context hierarchy.
	 * 
	 */
	public Context getParent();
	

	/**
	 * this is release Environment of the context hierarchy.
	 * 
	 */
	public Environment getEnvironment();
	
}
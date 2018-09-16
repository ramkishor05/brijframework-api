package org.brijframework.lifecycle;
public interface Initializer {
	/**
	 * Initialize the given application context.
	 * 
	 * @param applicationContext
	 *            the application to configure
	 */

	default void preInit() {

	}

	default void init() {

	}

	default void postInit() {

	}
}
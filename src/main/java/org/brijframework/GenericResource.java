package org.brijframework;

import org.brijframework.lifecycle.Initializer;

public interface GenericResource<E> extends Initializer{

	public String getId();

	public String getName();
	
	public E getType();
}

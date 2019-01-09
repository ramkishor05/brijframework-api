package org.brijframework.factories;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.container.Container;

public interface Factory {

	Factory loadFactory();

	Container getContainer();

	void setContainer(Container container);

	ConcurrentHashMap<?, ? extends Object> getCache();

	Factory clear();

}
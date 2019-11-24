package org.brijframework.factories;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.container.Container;

public interface Factory<K,T> {

	Factory<K,T> loadFactory();

	Container getContainer();

	void setContainer(Container container);

	ConcurrentHashMap<K, T> getCache();

	Factory<K,T> clear();
	
	public  T register(K key, T data);

	public  T find(K key);

}
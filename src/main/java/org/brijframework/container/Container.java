package org.brijframework.container;

import java.util.concurrent.ConcurrentHashMap;

import org.brijframework.group.Group;

public interface Container {

	public Container loadContainer();

	public Container reLoadContainer();

	public Container clearContainer();
	
	public Group merge(Object groupKey, Group group);
	
	public Group add(Object groupKey, Group group);
	
	public <T> T  add(Object groupKey, Object key, T  object);
	
	public Group update(Object groupKey,Group group);
	
	public <T> T  update(Object groupKey, Object key, T  object);
	
	public Group remove(Object groupKey);
	
	public <T> T  remove(Object groupKey, Object key);

	public Group get(Object groupKey);
	
	public Group load(Object groupKey);

	public <T> T get(Object groupKey, Object key);
	
	public Group search(Object groupKey);

	public <T> T search(Object groupKey, Object key);
	
	public <T> T find(Object _key);

	public ConcurrentHashMap<Object,Group> getCache();

	public <T> T search(Object groupKey, String parentID, Class<?> type);
}

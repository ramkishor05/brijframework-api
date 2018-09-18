package org.brijframework.group;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public interface Group extends Serializable{
	
	public Object getGroupKey();
	
	public <T> T add(Object key, T value);

	public <T> T marge(Object key, T value) ;

	public <T> T update(Object key, T value);

	public <T> T remove(Object key);

	public <T> T get(Object key);
	
	public <T> T getIgnoreCase(Object key) ;

	public <T> T find(Object key);

	public boolean containsKey(Object key);
	
	public <T> T indexOfValue(int i);
	
	public <T> T indexOfKey(int i);

	@SuppressWarnings("rawtypes")
	public ConcurrentHashMap getCache();

	public <T>T find(String parentID, Class<?> type);

}

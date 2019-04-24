package org.brijframework;

import java.io.Serializable;

/***
 * BeanContext interface which is provide comman method to manipulate of object.
 * @author Ram Kishor
 *
 */
public interface ObjectContext extends Serializable{
	
	/***
	 * these provides us to set value of key for object.
	 * @param _key
	 * @param _value
	 * @return
	 */
	public <T> T setProperty(String _key, T _value);

	/****
	 * these provides us to get value of key for object.
	 * @param _key
	 * @return
	 */
	public <T> T getProperty(String _key);
	
	/***
	 * these provides us to check key which is contains or not for object.
	 * @param _key
	 * @return
	 */
	public Boolean containsKey(String _key);

	/****
	 * these provides us to check value of key which is contains or not for object.
	 * @param _key
	 * @return
	 */
	public Boolean containsValue(String _key);
	
	/***
	 * these provides us to get type of key for object.
	 * @param _key
	 * @return
	 */
	public Class<?> typeOfProperty(String _key);
	
	
}
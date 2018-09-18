package org.brijframework;

import java.util.Map;

/***
 * 
 * @author Ram Kishor
 *
 */
public interface BaseModel extends BaseObject {

	/***
	 * these provides us to set values of keys for object.
	 * 
	 * @param _keys
	 * @param _values
	 * @return
	 */
	public Map<String, ?> setProperties(String[] _keys, Object... _values);

	/***
	 * these provides us to set values of keys for object.
	 * 
	 * @param _keys
	 * @param _values
	 * @return
	 */
	public Map<String, ?> setProperties(String _keys, Object... _values);

	/***
	 * these provides us to set values of keys which is contains or not for object.
	 * 
	 * @param _keys
	 * @param _values
	 * @return
	 */
	public Map<String, ?> safeProperties(String _keys, Object... _values);

	/***
	 * these provides us to set values of keys for object.
	 * 
	 * @param _properties
	 * @return
	 */
	public Map<String, ?> setProperties(Map<String, Object> _properties);
	
	/***
	 * these provides us to fill values of keys for object.
	 * 
	 * @param _properties
	 * @return
	 */
	public void fillProperties(Map<String, Object> _properties);

	/***
	 * these provides us to get properties for object.
	 * @return
	 */
	public Map<String, ?> getProperties();

	/***
	 * these provides us to get properties for object.
	 * @param _keys
	 * @return
	 */
	public Map<String, ?> getProperties(String... _keys);

	/***
	 * these provides us to get safe properties for object.
	 * @param _keys
	 * @return
	 */
	public Map<String, ?> safeProperties(String... _keys);

	/***
	 * these provides us to check keys for object which is cantains or not.
	 * @param _keys
	 * @return
	 */
	public Map<String, Boolean> cantainsProperties(String _keys);

}

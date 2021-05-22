package org.brijframework;

public enum Access {
	/**
	 * Access setting which means that visibility rules are to be used to
	 * automatically determine read- and/or write-access of this property.
	 */
	AUTO,

	/**
	 * Access setting that means that the property may only be read for
	 * serialization, but not written (set) during deserialization.
	 */
	READ_ONLY,

	/**
	 * Access setting that means that the property may only be written (set) for
	 * deserialization, but will not be read (get) on serialization, that is, the
	 * value of the property is not included in serialization.
	 */
	WRITE_ONLY,

	/**
	 * Access setting that means that the property will be accessed for both
	 * serialization (writing out values as external representation) and
	 * deserialization (reading values from external representation), regardless of
	 * visibility rules.
	 */
	READ_WRITE;

	public static Access findValue(String type) {
		for(Access access:values()) {
			if(access.toString().equalsIgnoreCase(type)) {
				return access;
			}
		}
		return AUTO;
    		
    }

}

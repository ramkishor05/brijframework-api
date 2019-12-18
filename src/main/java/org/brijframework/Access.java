package org.brijframework;

/**
 * Various options for {@link #access} property, specifying how property may be
 * accessed during serialization ("read") and deserialization ("write") (note
 * that the direction of read and write is from perspective of the property, not
 * from external data format: this may be confusing in some contexts).
 * <p>
 * Note that while this annotation modifies access to annotated property, its
 * effects may be further overridden by {@link JsonIgnore} property: if both
 * annotations are present on an accessors, {@link JsonIgnore} has precedence
 * over this property. This annotation property is, however, preferred over use
 * of "split" {@link JsonIgnore}/<code>JsonProperty</code> combination.
 *
 * @since 1.0
 */
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

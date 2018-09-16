package org.brijframework.factories;

import org.brijframework.accessor.Accessor;
import org.brijframework.factories.Factory;

public interface AccessorFactory extends Factory{
	
	public <T> Accessor getAccessor(String _meta);
	
	public <T> Accessor getAccessor(String _meta, String _name);

	public <T> Accessor getAccessor(String _meta, String _name,Object params);
	
	@Override
	default AccessorFactory clear() {
		this.getCache().clear();
		return this;
	}
	
}

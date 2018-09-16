package org.brijframework.accessor;

import java.io.Serializable;

import org.brijframework.lifecycle.Initializer;

public interface Accessor extends Initializer,Serializable {

	String getTargetID();
	
}

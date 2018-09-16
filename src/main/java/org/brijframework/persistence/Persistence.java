package org.brijframework.persistence;

import java.io.File;

public interface Persistence {

	public void readObject(File _file);
	
	public void readObject(String _path);
	
	public void writeObject(File _file);
	
	public void writeObject(String _path);
}

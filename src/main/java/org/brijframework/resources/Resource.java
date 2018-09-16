package org.brijframework.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public interface Resource {

	boolean exists();

	File getFile();
	
	String getExtension();
	
	URI getURI() throws URISyntaxException;

	long contentLength();

	long lastModified() ;

	String getFilename();

	byte[] getContent();

	InputStream getInputStream() throws IOException;
}

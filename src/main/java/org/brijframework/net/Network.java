package org.brijframework.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public interface Network {
   
	public String getId();
	
	public String getHost();
	
	public Number getPort();
	
	public boolean isSecure();
	
	public String getProtocal();

	public URLConnection openConnection() throws IOException;

	public URLConnection closeConnection() throws IOException;

	public URL getConnectionUrl() throws MalformedURLException;

	public boolean isAlive();

	public boolean isReachable() throws IOException;
}
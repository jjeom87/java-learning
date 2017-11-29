package net.sunj.learning.utils.kapt.http;

import java.util.Map;

public class KaptWebServiceHttpProxy implements HttpProxy {
	private String url;
	private String devMode;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setDevMode(String devMode) {
		this.devMode = devMode;
	}

	@Override
	public Map<String, Object> send() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

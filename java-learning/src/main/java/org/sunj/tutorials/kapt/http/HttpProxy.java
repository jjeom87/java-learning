package org.sunj.tutorials.kapt.http;

import java.util.Map;

public interface HttpProxy {
	Map<String, Object> send() throws Exception;
}
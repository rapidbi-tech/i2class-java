package com.i2class;

import javax.servlet.http.HttpServletResponse;

public class ThreadLockXML extends ThreadLockContent {
	
	public String getContent(HttpServletResponse response) throws Exception {
		return getXML();
	}

}

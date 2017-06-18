package com.iws.codeservice.factory;

import com.iws.codeservice.dao.CodesDaoIF;
import com.iws.codeservice.dao.CodesDaoImpl;

public class DaoFactory {

	private static CodesDaoIF codesDao = null;

	static {
		codesDao = new CodesDaoImpl();
	}

	public static CodesDaoIF codesFactory() {
		return codesDao;
	}

	
}

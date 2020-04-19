package com.sample.repo.app;

public class ConstantESample {

	public static final String NAME = "admin";

	static public final String PASSWORD="password";

	public static int customerCount = 0;

	public static boolean isActive = false;

	public static volatile int value =
			1;

	private void method() {
		String password = PASSWORD;
		if (NAME.equals(password)) {
			isActive
					= true;
		}

		customerCount ++ ;
	}
	
}

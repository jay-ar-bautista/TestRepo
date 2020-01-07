package com.test.repo.app;

public class UnusedPrivateMethodSample {

	
	public  String testMethod() {
		return "Test";
	}
	
	private String unusedInstanceMethod() {
		return "This method can be removed";
	}
	
		return "This static method can be removed";
	}
}

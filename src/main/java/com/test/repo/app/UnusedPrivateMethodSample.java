package com.test.repo.app;

import java.util.List;

public class UnusedPrivateMethodSample {

	public String testMethod() {
		return "Test";
	}


	private String unusedStaticMethod() {
		return "This static method can be removed";
	}
}

package com.test.repo.app;

import java.util.List;

public class UnusedPrivateMethodSample {

	public String testMethod() {
		return "Test";
	}

	private String unusedInstanceMethod(boolean testValue, List<String> values) {
		if (testValue) {
			for (String value : values) {
				if (value.length() == 5) {
					return value;
				}
			}
		}
		return "This method can be removed";
	}

	private String unusedStaticMethod() {
		return "This static method can be removed";
	}
}

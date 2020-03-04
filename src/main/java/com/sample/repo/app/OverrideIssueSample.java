package com.sample.repo.app;

public class OverrideIssueSample {

	private static class Child extends Parent {

		public void methodOfParent() {
			throw new UnsupportedOperationException();
		}

	}

	private static class Parent {

		public void methodOfParent() {
		}
	}
}

package com.test.repo.app;

public class OverrideIssueSample {

	private static class Child extends Parent {

		@Override
		public void methodOfParent() {
			throw new UnsupportedOperationException();
		}

	}

	private static class Parent {

		public void methodOfParent() {
		}
	}
}

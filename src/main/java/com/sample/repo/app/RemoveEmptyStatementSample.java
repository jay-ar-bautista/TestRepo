package com.test.repo.app;

import java.util.List;

public class RemoveEmptyStatementSample {

	public void test(int value) {
		try {
			if (value == 4) {
				;
				return;
			}
		} catch (Exception a) {
		}
	}

	public void test(List<String> values) {
		for (String value : values);
	}

}

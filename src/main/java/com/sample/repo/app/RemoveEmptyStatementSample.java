package com.sample.repo.app;

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

	
	// added out of scope changes
	public void test(List<String> values) {
		for (String value : values);
	}

}

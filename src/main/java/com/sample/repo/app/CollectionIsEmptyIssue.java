package com.sample.repo.app;

import java.util.List;

public class CollectionIsEmptyIssue {

	public static boolean testCollection(List<String> values) {
		return values.size() == 0;
	}
}

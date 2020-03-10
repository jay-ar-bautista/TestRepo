package com.sample.repo.app;

import java.util.List;

public class RemoveEmptyStatementSample {

	public void test(List<String> values) {
		int a = 0;;
	}

	public void test1() {
		;
	}
	
	public void test2 () { 
	}
	
	public void test3 () {;
	    int a = 0;
	}
	
	public void test4() {
		int a = 0;
		;
	}

	public void test5() {
		int a = 0;
		; int b = 9;
	}
	
	public void test6() {
		int a = 0
		;
	}
}

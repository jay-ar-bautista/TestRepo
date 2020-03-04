package com.sample.repo.app;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MemoryLeaksSample {

	public void test() throws IOException {
		File file = new File("test.txt");
		FileReader reader = new FileReader(file);
		reader.read();
	}
}

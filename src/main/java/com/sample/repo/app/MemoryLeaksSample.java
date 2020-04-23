package com.sample.repo.app;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

public class MemoryLeaksSample {

    public void test1() {
        try {
            File file = new File("test1.txt");
            FileReader reader = new FileReader(file);
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        try {
            File file = new File("test2.txt");
            FileReader reader = new FileReader(file);
            reader.read();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test3() throws {
        FileReader reader = null;
        try {
            File file = new File("test3.txt");
            reader = new FileReader(file);
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void test4() {
        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append("text1");
            stringWriter.append("text2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.sample.repo.app;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

public class MemoryLeaksSample { 

    public void test1() {
        try {
            File file1 = new File("test1.txt");
            FileReader reader1 = new FileReader(file1);
            reader1.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test2() {
        try {
            File file2 = new File("test2.txt");
            FileReader reader2 = new FileReader(file2);
            reader2.read();
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test3() {
        FileReader reader3 = null;
        try {
            File file3 = new File("test3.txt");
            reader3 = new FileReader(file3);
            reader3.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader3 != null) {
                try {
                    reader3.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void test4() {
        try {
            StringWriter stringWriter4 = new StringWriter();
            stringWriter4.append("text1");
            stringWriter4.append("text2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test5() throws IOException {
        File file5 = new File("test5.txt");
        FileReader reader5 = new FileReader(file5);
        reader5.read();
    }

}

package com.sample.repo.app;

import java.io.IOException;
import java.sql.SQLException;

public class RecCatchExceptionSample {

    public static void testOnly() {
        try {
            testIOException();
            testNoException();
            testOtherException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testIOException() throws IOException {}

    public static void testOtherException() throws SQLException {}

    public static void testNoException() {}
}

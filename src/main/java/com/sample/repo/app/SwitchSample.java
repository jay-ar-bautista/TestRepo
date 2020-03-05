package com.devfactory.sample;

import java.util.List;

public class SwitchSample {

    public static String TEST = "test";

    public String test(int value, List<String> values) {

        boolean testIsEmpty = values.size() == 0;

        String returnValue = "";
        switch (value) {
            case 1:
                returnValue = "test1";
                break;
            case 2:
                returnValue = "test2";
                break;
            case 3:
                returnValue = "test2";
                break;
            case 4:
                returnValue = "test2";
                break;
            default:
                break;
        }
        return returnValue;
    }

    public String test1(int value, List<String> values) {

        boolean testIsEmpty = values.size() == 0;

        String returnValue = "";
        switch (value) {
            case 1:
                returnValue = "test1";
                break;
            case 2:
                returnValue = "test2";
                break;
            case 3:
                returnValue = "test2";
                break;
            case 4:
                return "test2";
        }
        return returnValue;
    }

    public String test2(int value, List<String> values) {

        boolean testIsEmpty = values.size() == 0;

        String returnValue = "";
        switch (value) {
            case 1:
                returnValue = "test1";
                break;
            case 2:
                returnValue = "test2";
                break;
            case 3:
                returnValue = "test2";
                break;
            case 4:
                throw new RuntimeException();
        }
        return returnValue;
    }

    public String test4(int value, List<String> values) {

        boolean testIsEmpty = values.size() == 0;

        String returnValue = "";
        switch (value) {
            case 1:
                returnValue = "test1";
                break;
            case 2:
                returnValue = "test2";
                break;
            case 3:
                returnValue = "test2";
                break;
            case 4:
                returnValue = "test2";
        }
        return returnValue;
    }
}

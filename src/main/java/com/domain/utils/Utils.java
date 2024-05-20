package com.domain.utils;

public class Utils {

    public static boolean isNullOrEmpty(Object object) {

        if (object == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNotNullOrEmpty(Object object) {

        if (object == null) {
            return false;
        } else {
            return true;
        }
    }

}

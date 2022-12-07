package com.sbicloudbd.utils;

public class NullOrEmpty {
    public static boolean isNullOrEmpty(String value){
        return value == null || value.trim().isEmpty();
    }

    public static boolean isNotNullOrEmpty(String value){
        return value != null && !value.trim().isEmpty();
    }
}

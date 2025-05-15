package com.test.RakeshTestDemo.utilis;

public class PolicyUtil {

    public static boolean isValidPolicyName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}
package com.airtribe.learntrack.util;

public class InputValidator {
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }
}

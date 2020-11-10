package com.regex;

public class EasyRegex {
    public static void main(String[] args) {
        // Removes whitespace between a word character and . or ,
        String pattern = "(\\w)(\\s+)([\\.,])";

        // Finding duplicated words
        pattern = "\\b(\\w+)\\s+\\1\\b";
    }
}

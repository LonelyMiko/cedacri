package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumber {
    public static void main(String[] args) {
        String[] numbers = {"1","a","3","abcd","f","2","6"};
        //Find Number Using [0-9]
        // \d == [0-9]
        Pattern findOnlyNumbers = Pattern.compile("[0-9]");
        for (String number : numbers)
        {
            Matcher numberMatcher = findOnlyNumbers.matcher(number);
            if (numberMatcher.find())
            {
                System.out.println(number);
            }
        }
    }
}

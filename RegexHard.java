package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHard {
    public static void main(String[] args) {
        String[] numbers = {"1","2.5","3","abcd","f","2","6"};

        //What supposed to do?
        Pattern hard = Pattern.compile("^\\d+(\\.\\d+)?");


        for (String number : numbers)
        {
            Matcher numberMatcher = hard.matcher(number);
            if (numberMatcher.find())
            {
                System.out.println(number);
            }
        }
    }
}

package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String emailDataBase[] = {"andrei@gmail.com","moryaloy@gmail.com","nioh@mail.ru","andrian@mail.ru"};

        //Check if text from emailDataBase contain "gmail.com"
        Pattern mail = Pattern.compile("gmail.com");
        for (String el : emailDataBase)
        {
            Matcher mailMatcher = mail.matcher(el);
            if (mailMatcher.find())
            {
                System.out.println(el);
            }

        }
    }
}

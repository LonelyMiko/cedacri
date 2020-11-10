package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //Cream o baza de email-uri
        String emailDataBase[] = {"andrei@gmail.com","moryaloy@gmail.com","nioh@mail.ru","andrian@mail.ru"};

        //Cream un regex care cauta "gmail.com" in text;
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

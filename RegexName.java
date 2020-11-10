package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexName {
    public static void main(String[] args) {
        String names[] = {"Andrei","Mihai","Ion","Anton","Vasile","Adam","Edward","artem","ivan","avram"};
        Pattern nameStartWithA = Pattern.compile("^a",Pattern.CASE_INSENSITIVE);
        Pattern nameStartWithAOrI = Pattern.compile("^a|^i",Pattern.CASE_INSENSITIVE);
        Pattern nameEndWithEOrI = Pattern.compile("e$|i$");
        Pattern nameStartWithAFollowedBy = Pattern.compile("^A[d-n]");
        Pattern nameStartWithANotFollowedByN = Pattern.compile("^A(?!n)");


        for (String name : names)
        {
            Matcher nameMatcher = nameStartWithA.matcher(name);
            if (nameMatcher.find())
            {
                System.out.println(name);
            }
        }

//        for (String name : names)
//        {
//            Matcher nameMatcher = nameStartWithAOrI.matcher(name);
//            if (nameMatcher.find())
//            {
//                System.out.println(name);
//            }
//        }

//        for (String name : names)
//        {
//            Matcher nameMatcher = nameStartWithAFollowedBy.matcher(name);
//            if (nameMatcher.find())
//            {
//                System.out.println(name);
//            }
//        }

//        for (String name : names)
//        {
//            Matcher nameMatcher = nameStartWithANotFollowedByN.matcher(name);
//            if (nameMatcher.find())
//            {
//                System.out.println(name);
//            }
//        }
    }
}

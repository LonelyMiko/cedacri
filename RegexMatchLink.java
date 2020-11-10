package com.regex;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchLink {
    public static void main(String[] args) {

        String[] sites = {"google.com", "github.com", "meet.jit",
                "oracle.com"};
        //Divide the domain names into two parts by using groups
        Pattern p = Pattern.compile("(\\w+)\\.(\\w+)");

        for (var site : sites) {

            Matcher matcher = p.matcher(site);

            while (matcher.find()) {

                System.out.println(matcher.group(0));
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
            }
            
            System.out.println("*****************");
        }
    }
}

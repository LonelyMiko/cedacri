package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSplit {
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Quisque laoreet dignissim ultrices. Maecenas porta ante vitae risus auctor, " +
                "vel scelerisque massa consequat. Mauris eu libero vitae lorem ultricies ultricies. " +
                "Vivamus ut pellentesque risus, eget mollis tortor. " +
                "Phasellus ante nisl, vehicula sed nibh a, " +
                "volutpat ornare nulla. Phasellus vestibulum ante dolor, ac finibus ipsum tempus id. " +
                "Vestibulum vel nunc erat.";

        //splitLoremIpsum will contain every word from loremIpsum string unsing regex \s
        // \s - A whitespace character: [ \t\n\x0B\f\r]
       String[] splitLoremIpsum = (loremIpsum.split("\\s"));
       for (String word : splitLoremIpsum)
       {
           System.out.println(word);
       }
    }
}

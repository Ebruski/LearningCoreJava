package com.ebruski.java.re;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s");
        String[] words = pattern.split("how are you");
        for (String word : words){
            System.out.println(word);
        }

        String s = "www.ebruskicode.com";
        String[] words2 = s.split("[.]");
        for (String word : words2){
            System.out.println(word);
        }
    }
}

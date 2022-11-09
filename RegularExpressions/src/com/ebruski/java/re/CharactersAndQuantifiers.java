package com.ebruski.java.re;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]+", "a"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "a"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test!"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "test!"));
    }
}

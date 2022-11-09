package com.ebruski.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{10}$");
        Matcher matcher = pattern.matcher("111111111");

        if (matcher.matches()){
            System.out.println("Valid cell no.");
        }
        else{
            System.out.println("invalid cell no.");
        }
    }
}

package com.ebruski.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
        Matcher matcher = pattern.matcher("ebruski@ebruski.com");

        if (matcher.matches()){
            System.out.println("Valid email id");
        }
        else{
            System.out.println("invalid email");
        }
    }
}

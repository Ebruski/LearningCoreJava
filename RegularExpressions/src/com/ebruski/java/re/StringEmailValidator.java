package com.ebruski.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEmailValidator {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$";
        String email = "ebruski@ebruski.com";

        if (email.matches(pattern)){
            System.out.println("Valid email id");
        }
        else{
            System.out.println("invalid email");
        }
    }
}

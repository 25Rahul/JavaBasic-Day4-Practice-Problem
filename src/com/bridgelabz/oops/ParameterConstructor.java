package com.bridgelabz.oops;

public class ParameterConstructor {
    String languages;
    ParameterConstructor(String lang){
        languages = lang;
        System.out.println(languages + " Programming Language");
    }
    public static void main(String[] args) {
        ParameterConstructor obj1 = new ParameterConstructor("Java");
    }
}

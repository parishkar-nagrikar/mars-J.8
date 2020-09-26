package com.mojo.hakerrank2;

public class StrMinimization {

    public static void main(String[] args) {
        String s = "aabcccabba";
        int l = s.length();

        String left_result  = s.substring(0, l/2);
        System.out.println(left_result);

        String right_result  = s.substring(l/2,l);
        System.out.println(right_result);

        String main_string = right_result+left_result;
        System.out.println(main_string);

    }
}
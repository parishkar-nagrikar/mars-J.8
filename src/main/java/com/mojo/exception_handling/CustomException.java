package com.mojo.exception_handling;

public class CustomException {

    public static void main(String[] args) {
        int age = 18;
        System.out.println(" age : "+18);
        throw new InvalidAgeException("InvalidAgeException--------");
    }
}
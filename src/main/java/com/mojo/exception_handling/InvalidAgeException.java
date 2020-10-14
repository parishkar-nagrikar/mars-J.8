package com.mojo.exception_handling;

public class InvalidAgeException extends RuntimeException {

    InvalidAgeException(String s){
        super(s);
    }
}

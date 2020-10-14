package com.mojo.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void printme(){
        System.out.println("inside ");
    }
}
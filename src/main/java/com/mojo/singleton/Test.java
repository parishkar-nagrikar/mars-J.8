package com.mojo.singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("This is test class!");

        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton + "mySingleton");

        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton2 + "mySingleton2");

        if(mySingleton==mySingleton2)
            System.out.println("equal!");


        EnumSingleton obj = EnumSingleton.INSTANCE;

        obj.printme();
    }
}

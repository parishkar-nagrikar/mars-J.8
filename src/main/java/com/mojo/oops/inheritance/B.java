package com.mojo.oops.inheritance;

public class B extends A{

    public void m2() {
        System.out.println("this is B");
    }
    public void m1() {
        System.out.println("this is B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
    }
}

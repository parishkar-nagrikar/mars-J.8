package com.mojo.interfaces;

// Java program to illustrate concrete class

// Concrete Class
class ConcreteClass {

    // this method calculates
    // product of two numbers
    static int product(int a, int b)
    {
        return a * b;
    }

    // this method calculates
    // sum of two numbers
    static int sum(int a, int b)
    {
        return a + b;
    }

    // main method
    public static void main(String args[])
    {
        int p = product(5, 10);
        int s = sum(5, 10);

        // print product
        System.out.println("Product: " + p);

        // print sum
        System.out.println("Sum: " + s);
    }
}

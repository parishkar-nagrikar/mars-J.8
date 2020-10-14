package com.mojo.oops.overloading;

public class Circle {

    public static void area(int r) {
            System.out.println(" area of circle is  :"+ (r*r)*3.14);
    }

    public static double area(int r,double pieV) {
            System.out.println(" area of circle is  :"+ (r*r)*pieV);

            return (r*r)*pieV;
    }

    public void circumference(int r){
        System.out.println(" area of circle is  :"+ 2*(r)*3.14);
    }

    public static void main(String[] args) {
        area(3);
        area(4,3.14);
    }
}

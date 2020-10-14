package com.mojo.interfaces.markerinterface;

public class Item implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product(1001);
       // Product product11 = (Product) product1.clone();

        Object o=Object.class;
        System.out.println(o);

    }


}

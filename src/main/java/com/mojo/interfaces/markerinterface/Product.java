package com.mojo.interfaces.markerinterface;

public class Product implements Cloneable{

    public Product(int id){
        id=this.id;
    }
    String name = "card";
    int id = 1;
    String color = "balck";
    Double price = 5858.99;
    Float weight = 20f;

    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product(101);
        Product p2 = (Product) p1.clone();
        System.out.println(p1.color);
        System.out.println(p2.color);

    }
}

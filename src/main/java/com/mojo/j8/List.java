package com.mojo.j8;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        System.out.println("This is List ");

        java.util.List integers = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {

            integers.add(i+1);
            integers.add(i+77);
        }
        System.out.println(" List :" + integers);
//for
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(" conventional for : " + integers.get(i));
        }
//forEach
        for (Object i:integers) {
            System.out.println(" for each :" + i);
        }
//forEach()
        integers.forEach( i -> System.out.println("forEach() :"+i));
        integers.stream().forEach(i-> System.out.println("stream.forEach() :"+i));
        integers.stream().forEachOrdered(i-> System.out.println("stream.forEachOrdered() :"+i));
    }
}

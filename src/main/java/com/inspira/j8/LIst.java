package com.inspira.j8;

import java.util.ArrayList;
import java.util.List;

public class LIst {
    public static void main(String[] args) {
        System.out.println("This is LIst ");

        List<Integer> integers = new ArrayList<>();
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
        for (Integer i:integers) {
            System.out.println(" for each :" + i);
        }
//forEach()
        integers.forEach( i -> System.out.println("forEach() :"+i));
        integers.stream().forEach(i-> System.out.println("stream.forEach() :"+i));
        integers.stream().forEachOrdered(i-> System.out.println("stream.forEachOrdered() :"+i));
    }
}

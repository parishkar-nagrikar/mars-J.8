package com.mojo.collection.List.ArrayList;

import com.mojo.j8.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class TestList {
    public static void main(String[] args) {
        System.out.println(" test! ");

        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(11);
        list.add(111);

        System.out.println(" list  " +list);

        //way1
        for (Integer i:list) {
            System.out.println( i );
        }
        
        //way 2 java8 lambdaExpression
        list.forEach(it->{
            System.out.println("element is " + it);
        });

        //way 3 iterator
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
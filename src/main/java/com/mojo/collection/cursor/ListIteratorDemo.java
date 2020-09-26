package com.mojo.collection.cursor;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add(1);
        vector.add(11);
        vector.add(111);
        vector.add(1111);
        vector.add(11111);
        vector.add(999999999);

        System.out.println(vector);

        ListIterator listIterator = vector.listIterator();

        while(listIterator.hasNext()){
            Integer integer = (Integer) listIterator.next();
            System.out.println(integer);

            if(listIterator.previousIndex()==999999999)
                listIterator.remove();
        }
        System.out.println(vector);
    }
}
package com.mojo.collection.cursor;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
        public static void main(String[] args) {
            Vector vector = new Vector();

            vector.add(1);
            vector.add(11);
            vector.add(111);
            vector.add(1111);
            vector.add(11111);
            vector.add(999999999);

        //System.out.println(vector);

        Iterator iterator =  vector.iterator();

        while(iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
//            System.out.println(integer);
            if(integer%2==0)
                System.out.println(integer);
            else
                iterator.remove();

            System.out.println(integer);
        }
    }
}
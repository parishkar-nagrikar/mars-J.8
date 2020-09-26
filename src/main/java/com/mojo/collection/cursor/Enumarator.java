package com.mojo.collection.cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Enumarator {
    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add(1);
        vector.add(11);
        vector.add(111);
        vector.add(1111);
        vector.add(11111);

        System.out.println(vector);

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            Object integer = enumeration.nextElement();
            System.out.println(integer);
        }
    }
}

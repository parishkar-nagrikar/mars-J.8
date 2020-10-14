package com.mojo.collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by p-Star on 7/19/2017.
 */
public class collectionDemo
{
    public static void main(String[] args)
    {
        ArrayList l=new ArrayList();

        l.add(0,"parish");

        l.add(1,"nagrikar");

        Collections collection ;//= new Collections();

        System.out.println(l);

        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);


    }
}

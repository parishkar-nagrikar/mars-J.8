package com.mojo.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by p-Star on 7/20/2017.
 */
public class ArraylistDemo
{

    public static void main(String[] args)
    {

        ArrayList arrayList=new ArrayList();

        arrayList.add(0,"parish");
        arrayList.add(1, "p");
        arrayList.add(2,null);
        arrayList.add("ss");

    //  ArrayList arrayList1= new ArrayList(arrayList.clone());

        arrayList.set(0,null);
        Object obj= arrayList.clone();

        List l = Collections.synchronizedList(arrayList);

        System.out.println(l);
        System.out.println( obj);


    }
}

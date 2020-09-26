package com.mojo.collection.List.ArrayList;

import java.util.ArrayList;

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

        System.out.println( obj);


    }
}

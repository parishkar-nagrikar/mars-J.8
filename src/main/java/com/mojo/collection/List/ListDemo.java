package com.inspira.collection.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by p-Star on 7/20/2017.
 */
public class ListDemo
{

    public static void main(String[] args)
    {
        List list =new ArrayList<>();

        //add()
        list.add(0,3);
        list.add(1, 2);
        list.add(2, 1);

        //get()
        list.get(1);
        list.get(2);
        list.get(0);
        System.out.println(list.get(0) + "" + list.get(1) + "" + list.get(2));

        //remove()
       list.remove(0);
       System.out.println(list.get(0) + "" + list.get(1) );

        //set()
        list.set(1,99);
        System.out.println(list.get(0) + "" + list.get(1) );

        //
       int a= list.indexOf(99);

        System.out.println(a);

        ArrayList arrayList1=new ArrayList<>();
        LinkedList linkedList1=new LinkedList<>();

        System.out.println( arrayList1 instanceof Serializable);
        System.out.println( linkedList1 instanceof Serializable);



    }
}

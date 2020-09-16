package com.inspira.collection.List.LinkedList;

import java.util.LinkedList;

/**
 * Created by p-Star on 7/20/2017.
 */
public class LinkedListDemo
{

    public static void main(String[] args)
    {
        LinkedList linkedList=new LinkedList();

        for (int i=0;i<=10;i++)
        {
            linkedList.add(i);
        }
        linkedList.addFirst(99);
        linkedList.addLast(11);

        System.out.println(linkedList);


    }
}

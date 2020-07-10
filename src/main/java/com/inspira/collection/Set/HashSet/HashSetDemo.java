package com.inspira.collection.Set.HashSet;

import java.util.HashSet;

/**
 * Created by p-Star on 7/20/2017.
 */
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet hashSet=new HashSet();

        hashSet.add("q");
        hashSet.add("w");
        hashSet.add("e");
        hashSet.add("r");
        hashSet.add("t");
        hashSet.add("y");


        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(11);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(11);
        hashSet.add(null);
        hashSet.add(11);
        hashSet.add(null);
        hashSet.add(11);
        hashSet.add(null);
        hashSet.add(11);
        hashSet.add(null);
        hashSet.add(11);
        hashSet.add(null);

        System.out.println(hashSet);
    }
}

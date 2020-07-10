package com.inspira.collection.Set.SortedSet;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by p-Star on 7/23/2017.
 */
public class SortedSetDemo
{
    public static void main(String[] args)
    {
        SortedSet sortedSet= new TreeSet<>();

        /*sortedSet.add('n');
        sortedSet.add('n');
        sortedSet.add('d');
        sortedSet.add('a');
        sortedSet.add('f');
*/       // System.out.println(sortedSet);

        String str1=new String("g");
        String str2=new String("v");
        String str3=new String("c");
        String str4=new String("j");
        String str5=new String("h");

        sortedSet.add(str1);
        sortedSet.add(str2);
        sortedSet.add(str3);
        sortedSet.add(str4);
        sortedSet.add(str5);



        System.out.println(sortedSet.headSet(str5));
        System.out.println(sortedSet.tailSet(str5));
    }
}
package com.mojo.collection.Set.SortedSet;

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

        sortedSet.add(1);
        sortedSet.add(11);
        sortedSet.add(111);
        sortedSet.add(1111);
        sortedSet.add(11111);
        sortedSet.add(111111);

        System.out.println(
                sortedSet.first() + " \n " +
                        sortedSet.last() + " \n " +
                            sortedSet.headSet(11) + " \n " +
                        sortedSet.tailSet(111) + " \n " +
                        sortedSet.subSet(1,111) + " \n " +
                        sortedSet.comparator()
        );
    }

}
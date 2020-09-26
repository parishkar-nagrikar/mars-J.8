package com.mojo.collection.Set.TreeSet;

import java.util.TreeSet;

/**
 * Created by p-Star on 7/23/2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet1=new TreeSet();
        TreeSet treeSet2=new TreeSet();

        // treeSet2.add("s");
        // treeSet1.add(1);
        treeSet2.clear();
        // treeSet2.add(null);
        // treeSet2.add(1);

        //treeSet1.add(new StringBuffer("A"));
        //treeSet1.add(new StringBuffer("AA"));

        System.out.println(treeSet1);
       // System.out.println( treeSet2);

        TreeSet treeSet = new TreeSet();

        treeSet.add('n');
        treeSet.add('n');
        treeSet.add('d');
        treeSet.add('a');
        treeSet.add('f');

        System.out.println(treeSet);

        String str1=new String("g");
        String str2=new String("v");
        String str3=new String("c");
        String str4=new String("j");
        String str5=new String("h");

        treeSet.add(str1);
        treeSet.add(str2);
        treeSet.add(str3);
        treeSet.add(str4);
        treeSet.add(str5);

        System.out.println(treeSet.headSet(str5));
        System.out.println(treeSet.tailSet(str5));
    }
}

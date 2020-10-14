package com.mojo.sample_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Altimatrix_1 {
    public static void main(String[] args) {
        String str = "abc123321pqr425";
        char[] chars = str.toCharArray();

        Set<Character> set = new HashSet<Character>();

        int sum = 0;


        System.out.println(set);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer i = Integer.parseInt(String.valueOf(iterator.next()));
            sum=sum+i;
        }
        System.out.println("sum :" + sum);
    }
}
package com.mojo.sample_programs;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Altimatrix_3 {
    public static void main(String[] args) {
        String str = "abc123321pqr425";

        Integer sum = Arrays.stream(ArrayUtils.toObject(str.toCharArray())).
                distinct().map(it-> {
                    try{
                        return Integer.parseInt(it.toString());
                    } catch(NumberFormatException e){
                        //System.out.println("not a number");
                    }
                    return 0;
        }).mapToInt(Integer::intValue).sum();


        System.out.println("Sum is :: " + sum );
//      Integer sum = set.stream().mapToInt(set)
//      Integer sum = set.stream().mapToInt(set
//      IntStream.of(integers).sum();
    }
}
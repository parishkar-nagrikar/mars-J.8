package com.mojo.corejava;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("!!! LambdaExpression !!!");
        //lambda with forEach()

        List<String> strings = new ArrayList<String>();
        strings.add("abcd");
        strings.add("efgh");
        strings.add("ijkl");
        strings.add("mnop");

        strings.forEach(
                (n)->{
                    System.out.println(n);
                }
        );
    }
}

package com.mojo.collection.List.Stack;

import java.util.Stack;
/**
 * Created by p-Star on 7/20/2017.
 */
public class StackDemo {
    public static void main(String[] args) {

        String name="MY NAME IS KHAN";
        System.out.println(name);

        Stack stack=new Stack();

        String[] temp=name.split(" ");

        for (int i=0;i<temp.length;i++) {
            stack.push(temp[i]);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}

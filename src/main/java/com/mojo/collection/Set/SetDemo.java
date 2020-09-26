package com.mojo.collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(1);
        set.add(11);
        set.add(111);
        set.add(1111);
        set.add(11111);
        set.add(11111);
        set.add(null);
        System.out.println(set.add(11111));
        System.out.println(set);
    }
}

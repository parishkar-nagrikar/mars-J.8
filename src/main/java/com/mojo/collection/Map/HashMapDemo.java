package com.mojo.collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by p-Star on 8/2/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        Map map = new HashMap();

        HashMap m=new HashMap<>();

        m.put("Prutha",1);
        m.put("Prutha",111);
        m.put(null, 1);
        m.put(null,1111);

        System.out.println(m);
    }
}
package com.mojo.collection.iterator;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
    public static void main(String[] args) {
        System.out.println("this is FailFastExample!!!");

        Map<String,String> map = new HashMap<>();
        map.put("Delhi","India");
        map.put("Beijing","China");
        map.put("NY","USA");
        map.put("Sydney","Australia");

        Iterator iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //map.put("islamabad","pakistan");
        }

        ArrayList<String> arrayList =  new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("AA");
        arrayList.add("AAA");
        arrayList.add("AAAA");

        System.out.println(arrayList);
        Iterator listIterator = arrayList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(iterator.next());
            arrayList.add("B");
        }
    }
}

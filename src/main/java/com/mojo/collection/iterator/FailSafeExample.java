package com.mojo.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        System.out.println("This is FailSafeExample!!!");

        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("Delhi","India");
        map.put("Beijing","China");
        map.put("NY","USA");
        map.put("Sydney","Australia");

        Iterator iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            map.put("islamabad","pakistan");
        }

        CopyOnWriteArrayList <String> arrayList = new CopyOnWriteArrayList<>();
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
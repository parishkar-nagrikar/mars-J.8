package com.mojo.j8;

import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {
        System.out.println(" HW ");

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        /*for (int i: integers ) {
            System.out.println(i);
        }*/

        integers.forEach(i -> System.out.println(" this is lambda exp  :" +i));

        integers.stream().forEach(i -> System.out.println(" this stream :"+i) );
    }
}

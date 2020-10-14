package com.mojo.ways_to_create_objects;

import java.lang.reflect.Constructor;

import static java.lang.Class.forName;

public class Test {

    public static void main(String[] args) throws  CloneNotSupportedException{
        try {
//new
            Test test = new Test();
            System.out.println(" -- " + test);
//Class.newInstant
            Class<?> test1 = Test.class.forName("Test");
            System.out.println(" -- " + test1);
            Test test2 = Test.class.newInstance();
            System.out.println(" -- " + test2);
//newInstant()
            Constructor<Test> test3 = Test.class.getConstructor();
            System.out.println(" -- " + test3);
//
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
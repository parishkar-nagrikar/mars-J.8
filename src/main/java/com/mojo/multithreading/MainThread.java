package com.mojo.multithreading;

public class MainThread {
    public static void main(String[] args) {
        MyThread t  = new MyThread();
        t.start();
        //t.run();
        //t.run(9);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : parent thread!");
        }

    }
}

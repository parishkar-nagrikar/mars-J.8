package com.mojo.multithreading;

public class MainThreadI {

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        //r.run();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r);
        t2.start();

        System.out.println("parent called!");
    }
}

package com.mojo.multithreading;

public class MyThread extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": child thread!");
        }
    }
    public void run(int i){
        for ( i = 0; i < 19; i++) {
            System.out.println(i + ": overridden run() called!");
        }
    }
    public void start(){
        super.start();
        for ( int i = 0; i < 19; i++) {
            System.out.println(i + ": start method called()");
        }
    }
}

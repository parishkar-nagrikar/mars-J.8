package com.mojo.abstraction;

public abstract class Bike {
    abstract void run();
}
class Honda4 extends Bike {

    @Override
    void run() {
        System.out.println("running safely!");
    }

    public static void main(String[] args) {
        Bike bike = new Honda4();
        bike.run();
    }
}
package com.mojo.singleton;

public class MySingleton implements Cloneable{
//1
     private static volatile MySingleton mySingleton;
//2
    private MySingleton(){

    }
//3
    public static synchronized MySingleton getInstance(){
        if(mySingleton==null) {
            mySingleton= new MySingleton();
        }
    return mySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

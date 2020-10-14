package com.mojo.sample_programs;

public class ClassD extends ClassC{

    public void e(){
        System.out.println("in e");
    }
    public void f(){
        System.out.println("in f");
    }

     public void c(int c){
        System.out.println("in c"+c);
    }
    void D(int c){
        System.out.println("in c"+c);
    }
    static int i=0;


    public static void main(String[] args) {
 //       ClassD classC = (ClassD) new ClassC();

        System.out.println(i);
 //       classC.c(1);
 //       classC.d();
    }
}

package com.mojo.j8;

import java.util.Arrays;
import java.util.List;

//class ConsuImp implements Consumer<Integer> {
//    @Override
//    public void accept(Integer i) {
////        System.out.println(" hello ");
//        System.out.println(i);
//    }
//}
public class LambdaExp {
    List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


    public static void main(String[] args) {
        System.out.println(" Hello World! - "+ LambdaExp.class);
        LambdaExp forLoop = new LambdaExp();
        //forLoop.for6();
        //forLoop.for7();
        forLoop.forLamda();
    }

    private void forLamda() {
     //  values.forEach((i) -> {System.out.println(i);});
     //  values.forEach(i -> System.out.println(i));
//        ConsuImp c = new ConsuImp();
//        values.forEach(c);
//        Consumer<Integer> c = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };
//        Consumer<Integer> c = (Integer i) ->    {
//                System.out.println(i);
//        };
//        Consumer<Integer> c =  i -> System.out.println(i);
        values.forEach(i -> System.out.println(i));
    }

    public void for6() {
        System.out.println(values);
        for (int i=0;i<values.size();i++) {
            System.out.println(values.get(i));
        }
    }

    public void for7() {
        for (int i :values) {
            System.out.println(i);
        }
    }
}
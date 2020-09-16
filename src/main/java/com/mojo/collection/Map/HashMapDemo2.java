package com.inspira.collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by p-Star on 8/2/2017.
 */
public class HashMapDemo2
{
    public static void main(String[] args)
    {

        HashMap m=new HashMap();

        m.put("cheeru",700);
        m.put("parish",800);
        m.put("nik",200);
        m.put("nag",500);
    //  m.put("parish",1000);

        System.out.println(m);
        System.out.println(m.put("parish",1000) );

//to get all keys
        Set s=m.keySet();
        System.out.println(s);

//to gert all the values
        Collection c=m.values();
        System.out.println(c);

///all key value thru set
        Set s1=m.entrySet();
        System.out.println(s1);

    }
}
package com.inspira.sample_programs;

/**
 * Created by p-Star on 8/3/2017.
 */
public class ReverseOfNo
{
    public static void main(String[] args)
    {
        System.out.println("World");
        int n=2591;
        int remender=0;
        int rev=0;

        while (n!=0)
        {
            remender =n%10;
            rev=remender+rev*10;
            n=n/10;
        }
        System.out.println("Reverse  "+rev);

        String no="";
    }
}

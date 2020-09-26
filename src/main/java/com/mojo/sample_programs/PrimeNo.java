package com.mojo.sample_programs;

/**
 * Created by p-Star on 8/3/2017.
 */
public class PrimeNo
{
    public static void main(String[] args)
    {
        int number=3611;
        int counter=0;

            for (int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    counter++;
                }
            }
        if (counter==0)
        {
            System.out.println(number+" is prime");
        }
        else
        {
            System.out.println(number+" is not prime");
        }
    }
}
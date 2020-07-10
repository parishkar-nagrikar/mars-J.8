package com.inspira.sample_programs;

/**
 * Created by p-Star on 8/3/2017.
 */
public class EvenNoOddNo
{
    public static void main(String[] args)
    {
        int number=465461;

        if(number!=0)
        {
            if(number%2==0)
            {
                System.out.println(number +" is even");
            }
            else
            {
                System.out.println(number +" is odd");

            }
        }
        else
        {
            System.out.println(number +" not valid no");
        }


    }
}

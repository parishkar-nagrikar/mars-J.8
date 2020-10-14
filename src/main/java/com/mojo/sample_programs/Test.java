package com.mojo.sample_programs;

public class Test {
    public static void main(String[] args) {

        //for(int i=1;i==i;i++){
            //System.out.println("dfdsf");
        //}

        String str = "abc123321pqr425";

        int i,j=0,row = 6;

        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int ii, jj;

//Outer loop for rows
            for (ii=0; ii<row; ii++) {
//inner loop for space
                for (jj=row-ii; jj>1; jj--) {
                    System.out.print(" ");
                }
//inner loop for columns
                for (jj=0; jj<=ii; jj++ ) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

/*    @Override
    public void run(int i) {

    }*/
}

package math;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[]args) {

        ArrayList<Integer>arr=new ArrayList<Integer>();
        int a [] ={10,2,1,4,5,3,7,8,6};
        int j=a[0];
        for (int i=0; i<a. length;i++)

            {
                if (j == a[i])
                    j++;
                continue;

                else; arr.add(j);
            }
         System.out.println(" " + a);
            System.out.println(" " + a);


            }


    }



    /*

         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};




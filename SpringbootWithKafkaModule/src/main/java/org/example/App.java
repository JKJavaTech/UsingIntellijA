package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 *
 * sum in an array Input:
 * 		  nums = [8, 7, 2, 5, 3, 1] target = 10
 * 		  Output:
 * 		  Pair found (8, 2) or Pair found (7, 3)
 *
 * 		  nums = [5, 2, 6, 8, 1, 9] target = 12
 * 		  Output: Pair not found has context menu
 */
public class App 
{
    public static void main( String[] args )
    {
        int nums[]={8, 7, 2, 5, 3, 1};
        int resultSum=0;
        int firstNum=0,secondNum=0;


        for(int number:nums){
            for(int j=1;j<nums.length;j++) {
                resultSum = number + nums[j];
                if (resultSum == 10) {
                    firstNum = number;
                    secondNum = nums[j];
                    System.out.println("["+firstNum+","+secondNum+"]");
                    break;
                }
            }

        }
    }
}

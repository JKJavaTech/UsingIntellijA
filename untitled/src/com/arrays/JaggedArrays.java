package com.arrays;

public class JaggedArrays {
    public static void main(String[] args) {


        //creating the jagged array

        int [][] jagged={
                {1,2,3,4},
                {7,8,9,2}};

        //System.out.println(jagged[0][0]);
        //System.out.println(jagged[0][3]);

        //System.out.println(jagged[1][3]);

        int test[][]=new int[][]{{1,2,3,4},{5,6,7,8},{90090,909090,8686,787,9099}};
        int testOne[][]={{1,2,111},{2,3,4,5}};

        for(int i[]:jagged){
            System.out.println(i[0]);
            System.out.println(i[1]);
            System.out.println(i[2]);
            System.out.println(i[3]);
        }


    }
}

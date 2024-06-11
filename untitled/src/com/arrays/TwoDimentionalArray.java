package com.arrays;

public class TwoDimentionalArray {

    public static void main(String[] args) {


        int number[][]=new int[3][3];
        number[0][0]=90;
        number[0][1]=89;
        number[0][2]=90;

        number[1][0]=90;
        number[1][1]=89;
        number[1][2]=90;

        number[2][0]=90;
        number[2][1]=89;
        number[2][2]=90;


        System.out.println("Normal for loop");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(number[i][j]);
            }
        }

        System.out.println("Enhnace for Each loop");
        for(int[] element:number){
            System.out.println(element[0]);
            System.out.println(element[1]);
            System.out.println(element[2]);
        }
    }
}

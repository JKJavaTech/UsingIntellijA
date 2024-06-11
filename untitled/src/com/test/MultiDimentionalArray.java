package com.test;

public class MultiDimentionalArray {
    public static void main(String[] args) {
         int test[][]=new int[3][5];
         test[0][0]=9;
         test[0][1]=23;
         test[0][2]=56;
         test[0][3]=90;
         test[0][4]=89;

        test[1][0]=9;
        test[1][1]=23;
        test[1][2]=56;
        test[1][3]=90;
        test[1][4]=89;


        test[2][0]=9;
        test[2][1]=23;
        test[2][2]=56;
        test[2][3]=90;
        test[2][4]=89;

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println(test[i][j]);
            }
        }








    }
}

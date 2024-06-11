package com.test;

public class AddSum {

    public static void main(String[] args) {

        int test[]={1,2,3,4,5,6,79};
        int sum=0;
        for(int n:test){
            sum=sum+n;
        }
        System.out.println("The Sum Of The Array"+sum);
    }
}

package com.arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysProgram {

    public static void main(String[] args) {
        int test[]={10,34,67,78};
        int test1[]={10,34,67,78};

        Object[] obj={test};
        Object[] obj1={test1};

        boolean flag=Arrays.deepEquals(obj,obj1);
        System.out.println(flag);

        for(int i=0;i<=test.length-1;i++){
            if(test[i]==test1[i])
            {
                System.out.println("same");
            }

        }
    }
}

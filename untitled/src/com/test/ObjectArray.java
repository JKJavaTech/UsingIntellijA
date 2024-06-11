package com.test;

public class ObjectArray {

    public static void main(String[] args) {
        Object obj[]={1,1.1,"Test",'F',99999999999L
        ,"Hello Test",10,
                new Employee(12,"Rajan")
        };

        for(Object o:obj){
            System.out.println(o);
        }
    }
}

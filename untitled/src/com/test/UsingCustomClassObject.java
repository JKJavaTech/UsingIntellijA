package com.test;

import com.test.Employee;

public class UsingCustomClassObject {

    public static void main(String[] args) {

        Employee emp1=new Employee(1,"Test1");
        Employee emp2=new Employee(2,"Test2");
        Employee emp3=new Employee(3,"Test3");
        Employee emp4=new Employee(4,"Test4");

        Employee[] empArray={emp1,emp2,emp3,emp4};

        for(Employee empData:empArray){
            System.out.println(empData);
        }


    }


}

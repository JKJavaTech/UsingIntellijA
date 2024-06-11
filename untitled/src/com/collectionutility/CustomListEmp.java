package com.collectionutility;

import java.util.*;

public class CustomListEmp {

    public static void main(String[] args) {

        Employee emp1=new Employee(101,"Anirudh");
        Employee emp5=new Employee(105,"Lakshimi");
        Employee emp2=new Employee(102,"Arun");
        Employee emp4=new Employee(104,"Shirisha");
        Employee emp3=new Employee(103,"Gayathri");



        List<Employee> listEmp=new ArrayList<>();
        listEmp.add(emp1);
        listEmp.add(emp5);
        listEmp.add(emp3);
        listEmp.add(emp2);
        listEmp.add(emp4);


        System.out.println(listEmp);

        //1.Collectos.sort method
       // Collections.sort(listEmp);

        //listEmp.sort(Comparator.comparing(Employee::getId));
        listEmp.sort(Comparator.comparing(emp->emp.getId()));
      //  listEmp.sort(Comparator.naturalOrder());

        System.out.println("After Sorting"+listEmp);
        listEmp.sort(Comparator.comparing(emp->emp.getName().compareTo(emp.getName())));
        System.out.println("After Compare Names "+listEmp);


        List<Integer> listInr= Arrays.asList(10,20,89,90,6,7);
       // listInr.add("Hello");
        Collections.sort(listInr);
        System.out.println("After Sorting Test"+listInr);
        listInr.sort(Comparator.naturalOrder());
        System.out.println("Using Natural Sorting Order"+listInr);
        listInr.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order "+listInr);




    }
}

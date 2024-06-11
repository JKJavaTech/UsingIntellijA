package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {

    public static void main(String[] args) {

        Employee empOne=new Employee( 101,"Rajan",30,"Jr.programmer");
        Employee empTwo=new Employee( 129,"Karthik",30,"Programmar");
        Employee empThree=new Employee( 130,"Shirisha",23,"TechLead");
        Employee empFour=new Employee( 150,"Krishna",35,"Manager");
        Employee empFive=new Employee( 90,"Dhivya",30,"Analyst-SD");
        Employee empSix=new Employee( 69,"Radha",29,"Software");


        List<Employee> empList= Arrays.asList(empOne,empTwo,empThree,empFour,empFive);

        empList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).collect(Collectors.toList()).
                forEach((emp)-> System.out.println(emp));

    }
}

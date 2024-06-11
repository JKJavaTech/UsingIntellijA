package com.test;

public class Employee {

    private int id;
    private String name;

    public Employee(int i,String n) {
        this.id= i;
        this.name=n;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

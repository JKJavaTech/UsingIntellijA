package com.testone;

public class CustomerMain {

    public static void main(String[] args) {
        Address add=new Address("XYZ", 123456, "Bus Stand", "AP", "+91-9089786756");
        Address add1=new Address("ABC", 123456, "Bus Stand", "AP", "+91-9089786756");
        Address add2=new Address("DEF", 123456, "Bus Stand", "AP", "+91-9089786756");

        Customer customer = new Customer(100, "Rajan", "877878 7877 788", "AMKUHHH8999", "NJHyu",add);
        Customer customer1 = new Customer(101, "Rajan", "877878 7877 788", "AMKUHHH8999", "NJHyu",add1);
        Customer customer2 = new Customer(102, "Rajan", "877878 7877 788", "AMKUHHH8999", "NJHyu",add2);

        System.out.println("First Customer Address >>>> "+customer);
        System.out.println("Second Customer Address >>>> "+customer1);
        System.out.println("Third Customer Address >>>> "+customer2);


        Customer[] cust=new Customer[3];
        cust[0]=customer;
        cust[1]=customer1;
        cust[2]=customer2;

        for(Customer c:cust) {
            System.out.println(c);
        }



    }
}

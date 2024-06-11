package com.collectionutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceTest {

    public static void main(String[] args) {

        //create the object of the list interface

        List list=new ArrayList();

        List listOne=new ArrayList();


        //adding the elements into the list
        list.add(10);
        list.add(20);
        list.add("Hello");
        list.add(true);
        list.add(20);
        list.add(null);
        list.add(null);
        list.add(1,"JK");

        //adding the elements in list one
        listOne.add(10);
        listOne.add("Hello");
        list.addAll(listOne);

        //check the size
        System.out.println("Size of the ArrayList"+list.size());

        //how to iterate the ;ist collection
        System.out.println(list);
        ListIterator listIte=list.listIterator();
        while (listIte.hasNext()){
            System.out.println(listIte.next());

        }

        for(Object obj:list){
            System.out.println(obj);

        }



        //delete the elements from list
//        list.remove("Hello");
//        list.remove(new Integer(10));
//        list.remove(0);
//        list.removeAll(listOne);
//        list.removeFirst();
//        list.removeLast();


        System.out.println(list.get(0));

        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }


        list.set(0,"Hello Collection");


        List l= Arrays.asList(1,2,3,4,5);
        List l1=Arrays.asList("HelloOne","Hello Two");
        list.addAll(l1);
        list.addAll(l);
        System.out.println("After Adding "+list);

       list.retainAll(l);
        System.out.println("After Retain"+list);
        list.retainAll(l1);
        System.out.println("After Retain Test "+list);






   //     System.out.println(list);



    }
}

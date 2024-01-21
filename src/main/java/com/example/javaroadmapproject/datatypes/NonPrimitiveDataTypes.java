package com.example.javaroadmapproject.datatypes;

import java.util.ArrayList;
import java.util.List;

public class NonPrimitiveDataTypes {
     /*
    This file contains the non-primitive datatypes in java.
    This includes; String, Array, Collection(ArrayList, List),Classes and
    objects, enum, interface,Wrapper Classes.
    */

    String myString = "Hello, World!";
    int[] intArray = {1, 2, 3, 4, 5};
    String[] stringArray = {"apple", "banana", "orange"};

  // Creating a list of strings
  List<String> stringList = new ArrayList<>();

    public NonPrimitiveDataTypes(){

    }

    public void account(){
        stringList.add(0,"linda@email.com");
        stringList.add(1,"pomaa@email.com");
        stringList.add(2,"boateng@email.com");

        System.out.println(stringList);
        System.out.println(stringList.get(2));
        System.out.println(stringList.removeFirst());
        System.out.println(stringList);
    }

}

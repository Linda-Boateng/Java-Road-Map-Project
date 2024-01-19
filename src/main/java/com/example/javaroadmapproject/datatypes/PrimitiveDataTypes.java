package com.example.javaroadmapproject.datatypes;

public class PrimitiveDataTypes {
  	 /*
    This file contains the primitive datatypes in java.
    This includes; int,char,boolean,long,short,
    double,byte,float.

    Java provides wrapper classes for these primitive types
    for use in situations where objects are required such as
    APIs that returns an object and for use with collections.
    e.g Arraylist<Integer>
    */


    // Numeric types
    byte myByte = 127;
    short myShort = 32000;
    int myInt = 2147483647;
    long myLong = 9223372036854775807L;

    float myFloat = 3.14f;
    double myDouble = 3.141592653589793;

    // Character type
    char myChar = 'A';

    // Boolean type
    boolean isTrue = true;


    public PrimitiveDataTypes(){

    }

    public void isInt(){
        System.out.println("int: " + myInt);
    }

    public void isByte(){
        System.out.println("byte: " + myByte);
    }
    public void isChar(){
        System.out.println("char: " + myChar);
    }
    public void isLong(){
        System.out.println("long: " + myLong);
    }
    public void isBoolean(){
        System.out.println("boolean: " + isTrue);
    }
    public void isDouble(){
        System.out.println("double: " + myDouble);
    }
    public void isFloat(){
        System.out.println("float: " + myFloat);
    }
    public void isShort(){
        System.out.println("short: " + myShort);
    }

}

package com.example.javaroadmapproject.controlstructures;

public class IfThenElse {
     /*
    This file contains the various form of the IF-THEN-ELSE
    control structure in Java.
     The IF-THEN-ELSE statement is used for conditional execution.
     It allows you to execute a block of code if a specified condition
     evaluates to true, and another block of code if the condition
     evaluates to false.
    */

    public IfThenElse(){

    }

    public void OddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public void NestedIfElse(int age, boolean isStudent ){
        if (age >= 18) {
            if (isStudent) {
                System.out.println("You are a student and eligible for a student discount.");
            } else {
                System.out.println("You are eligible for a regular discount.");
            }
        } else {
            System.out.println("You are not eligible for a discount as you are under 18.");
        }
    }

    public void TernaryOperator(int x){
        String result = (x > 0) ? "Positive" : "Non-positive";
        System.out.println("The number is " + result + ".");
    }

}

package com.example.javaroadmapproject.controlstructures;

import java.util.Arrays;
import java.util.List;

public class Loops {
    /*
    Loops are used to execute a block of code repeatedly
    until a certain condition is met.
    There are three main types of loops in Java: for,
    while, and do-while
     */

    public Loops(){

    }

    public void forLoop(){
        //The for loop is used when the number of iterations is known beforehand.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }
    }

    public void whileLoop(){
        /*The while loop is used when the number of iterations is not known
        beforehand,and it depends on a condition.
         */

        int count = 0;
        while (count < 5) {
            System.out.println("Iteration " + count);
            count++;
        }
    }

    public void doWhileLoop(){
        /*
        The do-while loop is similar to the while loop,
        but it guarantees that the code block is executed at least once,
        even if the condition is false from the beginning.
         */

        int x = 0;
        do {
            System.out.println("Iteration " + x);
            x++;
        } while (x < 5);

    }

    public void loopControlStatement(){
        /*
        Control statements which includes break and continue is used
        to control or alter the flow of loops
         */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Iteration " + i);
        }

    }

    public void forEach(){
        /*
        Enhanced for loop (for-each loop):
        The enhanced for loop simplifies the
        process of iterating over arrays or collections.
        It is particularly useful when you need to iterate
        through all elements without the need for an explicit index.
         */

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void stream(){
        /*
        Streams allows you to perform functional-style operations on collections.
        Streams provide a concise and expressive way to work with collections.
         */

        List<String> names = Arrays.asList("Alice", "Bob","Afi", "Charlie","Avson");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }

    public void switchStatement(){
        String level;
        int score = 100;
        switch (score) {
            case 30:
                level = "Below Basic";
                break;
            case 40:
                level = "Basic";
                break;
            case 70:
                level = "Proficient";
                break;
            case 100:
                level = "exemplary";
                break;
            default:
                level = "More room for Improvement";
                break;
        }

        System.out.println("Your level in java is: " + level);

    }
}

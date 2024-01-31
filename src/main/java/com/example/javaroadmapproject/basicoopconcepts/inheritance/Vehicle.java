package com.example.javaroadmapproject.basicoopconcepts.inheritance;

public class Vehicle {
//    String color;
    int numberOfTyres;
    int numberOfSeats;
    boolean isElectric;


    public Vehicle(){

    }

    public Vehicle(int numberOfTyres, int numberOfSeats, boolean isElectric){
        this.numberOfTyres = numberOfTyres;
        this.numberOfSeats = numberOfSeats;
        this.isElectric = isElectric;
    }

}

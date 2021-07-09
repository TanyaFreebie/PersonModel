package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment
// Create a class that models a person
// features of the person class: height, gender, complexion, age
// actions: walking, talking, eat, and run.

//Solution
        //Decided to use less data, but more input from user


        Person id = new Person();//shortns the code

        Scanner  input= new Scanner(System.in);//set scanner

        //Ask user to input data

        System.out.println("Name of a person: ");
        id.setName(input.next());

        System.out.println("Age: ");
        id.setAge(input.nextInt());

        System.out.println("Height (m): ");
        id.setHeight(input.nextFloat());

        System.out.println("Weight: ");
        id.setWeight(input.nextFloat());

        System.out.println("Gender M/F:");
        id.setGender(input.next());

        System.out.println("Does it talk? Y/N: ");
        id.setTalk(input.next());

        //After we gathered all the data we need,
        // we can proceed with given that data back
        System.out.println("Now lets see what we can tell about " + id.getName() + ":");

        System.out.println("Name " + id.getName());
        System.out.println("Gender " +id.getGender());
        System.out.println("Age " + id.getAge());
        id.talking();
        id.complexion();







    }//End of main
}

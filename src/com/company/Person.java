package com.company;

public class Person {

   //persons features
    private String name;
    private String gender;
    private float height;
    private float weight;
    private int age;
    private String talk;
    //set SET/GET


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getTalk() {
        return this.talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }
    //Write actions walk, talk, eat, run

    public void talking(){
        if(age <=2){
            switch(talk){
                case "y":
                    System.out.println("That kid probably is a talking genius!");
                    break;
                case "n":
                    System.out.println("Talking ability develops by the age of 5, so it's fine");
            break;
            }
        } else {
            switch (talk){
                case "n":
                    System.out.println("If person doesn't talks there must be an issue");
                    break;
                default:
                    System.out.println(name + " can talk");

            }
        }
    }
    private double bmi = weight / Math.pow(height, 2);

    public void complexion(){
        if (age <=18){
            System.out.println("Since " + name+ " is a kid complexion could change in a while, just stay healthy and do sports.");
        } else {
            if(bmi<18.5) {
                System.out.println("Too skinny, try to visit your grandma more often.");
            } else if(18.5<= bmi && bmi <= 24.9){
                System.out.println("Normal complexion, stay fit!");
            } else {
                System.out.println("Overweight. Try to exercise more end eat less. Do not try to run marathon, just walk 10k steps every day.");
            }


        }


    }
}

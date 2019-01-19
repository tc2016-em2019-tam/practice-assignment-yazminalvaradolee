package com.company;

public class dog {
    // Dog properties
    private String breed;
    private int age;
    private double weight;
    private String name;


    public dog(String breed) {
        this.breed = breed;
    }

    public dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be less than 0");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().equals("")) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public void run() {
        System.out.println("I'm " + this.name + "and I'm running");
    }

    public void sleep() {
        System.out.println("ZZZZZZzzzzzzz..... (" + this.name + ")");
    }

    public void bark() {
        System.out.println("(" + this.name + ") Woof! Woof!");
    }
}

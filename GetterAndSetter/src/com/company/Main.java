package com.company;

import java.util.Random;

public class Main {

    private int id;
    private String name;

    public Main(int id, String name) {       // Constructor
        this.id = id;
        this.name = name;
    }

    public Main(String name) {
        this.id = new Random().nextInt();       // Constructor overloading...
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Main obj = new Main(101, "Alpesh");
        Main obj1 = new Main(102, "Gujjar");

        System.out.println(obj.getId());
        System.out.println(obj.getName());

        System.out.println(obj1.getId());
        System.out.println(obj1.getName());


       
    }
}

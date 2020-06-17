package com.company;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        /*  How hashmap works in Java */

        Student obj = new Student(0001, "Parth");
        Student obj1 = new Student(0001, "Parth");
        Student obj2 = new Student(0001, "Parth");




        Set<Student> set = new HashSet();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);


        for (Student X : set) {
            System.out.println(X);
        }
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        System.out.println("equal got called");
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId();
    }

    @Override
    public int hashCode() {
        System.out.println("hashcdde got called");
        return Objects.hash(getId(), getName());
    }
}
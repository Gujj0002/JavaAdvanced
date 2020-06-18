package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student(1000, new Course(2000));
        System.out.println(student);

        Student student1 = (Student) student.clone();
        System.out.println(student1);

        student.setId(4000);
        System.out.println("After modification");
        System.out.println(student);
        System.out.println("After cloning");
        System.out.println(student1);

        student.getCourse().setId(6000);
        System.out.println("After modification");
        System.out.println(student);
        System.out.println("After cloning");
        System.out.println(student1);


    }
}

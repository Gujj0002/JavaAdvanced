package com.company;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {


        /* Sorting objects with TreeSet interface using comparable interface..*/


        Student student = new Student(11, "Alps");
        Student student1 = new Student(14, "Patric");
        Student student2 = new Student(1, "Brown");
        Student student3 = new Student(11, "John");
        Student student4 = new Student(20, "Harry");

        Set<Student> students = new java.util.TreeSet<>();   // you can use lambda expression as well..
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId()) == 0 ?
                this.getName().compareTo(o.getName()) :
                this.getId().compareTo(o.getId());
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Alps", "Jones", new Department(12, "Computer")));
        students.add(new Student(15, "Patric", "Doe", new Department(18, "Computer")));
        students.add(new Student(17, "Harry", "John", new Department(19, "Computer")));
        students.add(new Student(19, "Jai", "Patel", new Department(25, "Biology")));
        students.add(new Student(13, "Dirty", "Gandhi", new Department(30, "Science")));

        Collections.sort(students, (o1, o2) -> o1.getDepartment().compareTo(o2.getDepartment()) == 0
                ? o1.getLastName().compareTo(o2.getLastName())
                : o1.getDepartment().compareTo(o2.getDepartment()));
        students.forEach(System.out::println);
    }
}

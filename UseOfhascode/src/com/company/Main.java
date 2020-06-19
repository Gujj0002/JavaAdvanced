package com.company;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(11, "Alps"),
                new Employee(14, "Patric"),
                new Employee(1, "Brown"),
                new Employee(11, "Alps"),
                new Employee(20, "Harry")
        );

        list.forEach(System.out::println);
        System.out.print("The set List..\n");

        Set<Employee> set = new HashSet<>(list);
        set.forEach(System.out::println);


    }
}

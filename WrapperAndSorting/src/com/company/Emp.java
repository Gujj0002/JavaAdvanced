package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Emp {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee[] {
                new Employee(12, "Alps"),
                new Employee(18, "Patric"),
                new Employee(45, "Brown"),
                new Employee(35, "Alps"),
                new Employee(85, "Alps"),
                new Employee(01, "Harry")
        });

        //Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
     //   System.out.println(list);
        list.forEach(System.out::println);    // Method reference...
    }
}

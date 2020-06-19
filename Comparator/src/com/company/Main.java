package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee[]{
               new Employee(12, "Alps"),
                new Employee(126, "patric"),
                new Employee(172, "Harry"),
                new Employee(1, "Alps"),
                new Employee(2, "Dirty"),
                new Employee(10, "Jai"),
        });

        /* Anonymous inner class by Comparator interface ..*/

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        employees.forEach(System.out::println);
    }
}

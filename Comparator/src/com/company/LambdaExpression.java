package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee[]{
                new Employee(12, "Alps"),
                new Employee(126, "patric"),
                new Employee(172, "Harry"),
                new Employee(1, "Alps"),
                new Employee(2, "Dirty"),
                new Employee(10, "Jai"),
        });

        /* Sorting using Lambda expression */

        Collections.sort(employees, (o1, o2) ->
                o1.getName().compareTo(o2.getName()) == 0 ? o1.getId().compareTo(o2.getId())
                        :  o1.getName().compareTo(o2.getName()) );
        employees.forEach(System.out::println);
    }
}

package com.company;

import java.util.*;

public class HashMap {

    public static void main(String[] args) {

        Employee employee = new Employee(11, "Alps");
        Employee employee1 = new Employee(14, "Patric");
        Employee employee2 = new Employee(1, "Brown");
        Employee employee3 = new Employee(11, "John");
        Employee employee4 = new Employee(20, "Harry");

        java.util.HashMap<Integer, Employee> hashMap = new java.util.HashMap<>();
        hashMap.put(employee.getId(), employee);
        hashMap.put(employee1.getId(), employee1);
        hashMap.put(employee2.getId(), employee2);
        hashMap.put(employee3.getId(), employee3);
        hashMap.put(employee4.getId(), employee4);

        hashMap.entrySet().forEach(x ->System.out.println(x.getKey() + " : " + x.getValue()));
    }
}

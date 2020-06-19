package com.company;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equal method called!");
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId()) &&
                getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode method called!");
        return Objects.hash(getId(), getName());
    }
}

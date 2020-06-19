package com.company;

public class Employee implements Comparable<Employee> {
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
    public int compareTo(Employee o) {
        if (this.name.compareTo(o.getName()) == 0){
            return this.id.compareTo(o.getId());
        }else {
            return this.name.compareTo(o.getName());
        }
    }
}

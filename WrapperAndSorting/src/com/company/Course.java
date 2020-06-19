package com.company;

public class Course implements Comparable<Course> {

    //private int id;        // primitive data members...
    private Integer id;    // Wrapper class..

    public Course(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Course o) {
       // return this.id - o.getId();     // if you're sorting with primitive data members..
        return this.id.compareTo(o.getId());      // sorting with wrapper classes...
    }
}

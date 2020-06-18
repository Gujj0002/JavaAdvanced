package com.company;

import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException {

        Student student = new Student(1000, new Course(2000));
        System.out.println(student);

        FileOutputStream fileOutputStream = new FileOutputStream(new File("Student.ser"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
}

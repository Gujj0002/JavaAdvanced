package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(new File("Student.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student deserialization =(Student) objectInputStream.readObject();
        System.out.println(deserialization);
    }
}

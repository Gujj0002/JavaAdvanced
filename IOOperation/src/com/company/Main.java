package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /* This will create file and write into it.....*/
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Test.txt"));
        bufferedWriter.write("Hello there");
        bufferedWriter.newLine();
        bufferedWriter.write("Welcome to Java");
        bufferedWriter.newLine();
        bufferedWriter.write("You're going to learn java!");
        bufferedWriter.flush();
        bufferedWriter.close();

        /* Reading out the given file....*/
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Test.txt"));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }

        /* read file using lambda expression*/
        bufferedReader.lines().forEach(str -> System.out.println(str));


        /*read file using input stream method...*/
        InputStream inputStream = new FileInputStream(new File("Test.txt"));
        int i = 0;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}

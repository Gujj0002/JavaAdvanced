package com.company;

public class ArrayIndex {
    public static void main(String[] args) {

        int[] ints = new int[05];
        ints[0] = 4;
        ints[1] = 6;
        ints[2] = 8;
        ints[3] = 10;
        ints[4] = 12;

        for (int i =0; i < ints.length; i++){
            System.out.println(i + ": " + ints[i]);
        }
    }
}

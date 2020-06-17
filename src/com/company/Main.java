package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String[] str = {"Alps ", "Patric ", "Jai ", "Harry ", "Dirty "};

        for (int i = 0; i < str.length; i++) {         // Print out thr items of Array..
            System.out.print(str[i]);
        }
        System.out.println();
        for (int i = str.length - 1; i >= 0; i--) {      // Print out the reverse array list....
            System.out.print(str[i]);
        }
        System.out.println();
        Collections.reverse(Arrays.asList(str));       // Reverse the sting as list...With Collections
        reverse(str);
    }

    private static void reverse(String[] str) {

        for (Object data : Arrays.asList(str)) {

            System.out.printf("%s", data);
        }
    }
}

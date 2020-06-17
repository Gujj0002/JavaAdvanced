package com.company;

import java.util.Collections;

public class ReverseString {

    public static void main(String[] args) {

        String string = "Something has happened wrong since the last time";
        String[] list = string.split(" ");
        String reverse = " ";

       for (int i = list.length - 1; i >= 0; i--) {

            reverse = reverse + list[i];

        }
        System.out.println(reverse);


       /* StringBuilder stringBuilder = new StringBuilder(string);
    //    stringBuilder = stringBuilder.reverse();

        System.out.println(stringBuilder.reverse().toString());*/
    }
}

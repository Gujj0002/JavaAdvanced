package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringHashSet {

    public static void main(String[] args) {

        String string = "The quick brown fox jumps";
        String stringA = " The brown jumps";
        String s3 = string.concat(stringA);
        String[] s4 = s3.split(" ");


        Set<String> set = new HashSet<>(Arrays.asList(s4));
        System.out.println(set);



    }
}

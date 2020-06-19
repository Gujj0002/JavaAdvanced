package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Course> list = new ArrayList<>();
        list.add(new Course(125));
        list.add(new Course(12));
        list.add(new Course(15));
        list.add(new Course(185));
        list.add(new Course(19));
        list.add(new Course(1));
        list.add(new Course(2));

        Collections.sort(list);     // print out sorting list...
        Collections.sort(list, Collections.reverseOrder());   // print out Reverse list.....
        System.out.println(list);

    }
}

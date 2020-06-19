package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* list is a interface of Collection interface
        * accept duplicate values
        * follow insertion order
        * accept null values
        * */

        // ArrayList implementation...
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(15);
        list.add(8);
        list.add(6);

        list.forEach(System.out::println);

        //  LinkedList implementation...
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(15);
        list1.add(8);
        list1.add(6);
        list1.forEach(System.out::println);

        /* set is an interface of collection interface
        * does not accept duplicate value
        * does not follow insertion order
        * give unique object*/

        // Hashset implementation...
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(15);
        set.add(9);

        set.forEach(System.out::println);

        // TreesSet implementation...
        Set<Integer> set1 = new TreeSet<>();   // TreeSet gives automatically sorted output.....
        set1.add(10);
        set1.add(15);
        set1.add(20);
        set1.add(15);
        set1.add(9);

        set1.forEach(System.out::println);

        /* map interface of collection interface */

        HashMap<Integer, String> hashMap = new HashMap<>();  // Hashmap implementation..
        hashMap.put(10, "Alps");
        hashMap.put(12, "Harry");
        hashMap.put(14, "John");
        hashMap.put(17, "Patric");
        hashMap.put(10, "Brown");

        hashMap.entrySet().forEach(x -> System.out.println(x.getKey() + " :" + x.getValue()));
    }
}

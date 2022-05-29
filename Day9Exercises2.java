package com.Week3RevatureTraining.Day9LinkedList;

import java.util.HashSet;
import java.util.Iterator;

/**
 * # HashSet
 * 1. Write a Java program to append the specified element to the end of a hash set.
 * 2. Write a Java program to iterate through all elements in a hash list.
 * 3. Write a Java program to get the number of elements in a hash set.
 * 4. Write a Java program to empty a hash set.
 */

class Exercises2 {
//1. Write a Java program to append the specified element to the end of a hash set.
public static class Question1{
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();
        country.add("USA");
        country.add("UK");
        country.add("Canada");
        country.add("Australia");
        country.add("China");
        country.add("Japan");
        country.add("Russia");

        System.out.println("The Hash Set: " + country);
    }
}

//2. Write a Java program to iterate through all elements in a hash list.
public static class Question2{
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Vick");
        names.add("James");
        names.add("Jaquan");
        names.add("Hannah");
        names.add("Lucy");

        Iterator n = names.iterator();
        while (n.hasNext()){
            System.out.println(n.next());
        }
    }
}

//3. Write a Java program to get the number of elements in a hash set.
public static class Questions3{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hi");
        set.add("My");
        set.add("Name");
        set.add("Is");
        set.add("Jaquan");
        System.out.println(set.size());
    }
}

//4. Write a Java program to empty a hash set.
public static class Question4{
    public static void main(String[] args) {
        HashSet<String> bills = new HashSet<>();
        bills.add("electric");
        bills.add("water");
        bills.add("internet");
        bills.add("phone");
        bills.add("car insurance");

        System.out.println("The HashSet : " + bills);

        bills.clear();
        System.out.println("The HashSet is empty: " + bills);
    }
}

}

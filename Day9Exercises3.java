package com.Week3RevatureTraining.Day9LinkedList;

import java.util.Iterator;
import java.util.TreeSet;



/**
 * # TreeSet
 * 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
 * 2. Write a Java program to iterate through all elements in a tree set.
 * 3. Write a Java program to add all the elements of a specified tree set to another tree set.
 * 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
 * 5. Write a Java program to get the first and last elements in a tree set
 */

public class Exercises3 {
//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
public static class Question1{
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Silver");

        System.out.println(colors);
    }
}

//2. Write a Java program to iterate through all elements in a tree set.
public static class Question2{
    public static void main(String[] args) {
        TreeSet<String> games = new TreeSet<>();
        games.add("Elden Ring");
        games.add("Madden");
        games.add("NBA 2K22");
        games.add("Resident Evil");
        games.add("Super Mario");

        Iterator g = games.iterator();
        while(g.hasNext()){
            System.out.println(g.next());
        }
    }
}

//3. Write a Java program to add all the elements of a specified tree set to another tree set.
    public static class Question3{
    public static void main(String[] args) {
        TreeSet<Integer> obj1 = new TreeSet<Integer>();
        obj1.add(3);
        obj1.add(15);
        obj1.add(10);
        obj1.add(35);

        TreeSet<Integer> obj2 = new TreeSet<Integer>();
        obj2.add(8);
        obj2.add(4);
        obj2.add(9);

        System.out.println("Original TreeSet: " + obj1);
        obj2.addAll(obj1);
        System.out.println("The new TreeSet: " + obj2);

    }
}

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
public static class Question4{
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        TreeSet<Integer> reverse = (TreeSet<Integer>)num.descendingSet();

        System.out.println(reverse);
    }
}

//5. Write a Java program to get the first and last elements in a tree set
public static class Question5{
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("It's");
        set.add("Me");
        set.add("World");

        System.out.println(set);
        System.out.println("First: "+ set.pollFirst());
        System.out.println("Last: "+ set.pollLast());
    }
}

}

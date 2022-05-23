package com.Week3RevatureTraining.Day9LinkedList;

/**
 * 1. Write a Java program to append the specified element to the end of a linked list.
 * 2. Write a Java program to iterate through all elements in a linked list.
 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
 * 4. Write a Java program to iterate a linked list in reverse order.
 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
 */
import java.util.Iterator;
import java.util.LinkedList;

class Exercises1 {
//1. Write a Java program to append the specified element to the end of a linked list.
    public static class Question1{
        public static void main(String[] args) {
            LinkedList<String> names = new LinkedList<>();
            names.add("Jaquan");
            names.add("Tony");
            names.add("Jake");

            System.out.println(names);
            names.add(3,"James");
            System.out.println(names);

        }
    }

//2. Write a Java program to iterate through all elements in a linked list.
    public static class Question2{
        public static void main(String[] args) {
            LinkedList<String> shapes = new LinkedList<>();
            shapes.add("Circle");
            shapes.add("Square");
            shapes.add("Triangle");
            shapes.add("Rectangle");

            Iterator iterator = shapes.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static class Question3{
        public static void main(String[] args) {
            LinkedList<String> shapes = new LinkedList<>();
            shapes.add("Circle");
            shapes.add("Square");
            shapes.add("Triangle");
            shapes.add("Rectangle");
            shapes.add("Trapezoid");

            Iterator s = shapes.listIterator(1);

            while(s.hasNext()){
                System.out.println(s.next());
            }
        }
    }


//4. Write a Java program to iterate a linked list in reverse order.
    public static class Question4{
        public static void main(String[] args) {
            LinkedList<String> games = new LinkedList<>();
            games.add("Legend of Zelda");
            games.add("Super Mario Sunshine");
            games.add("Call of Duty");
            games.add("Battlefield");
            games.add("Last of Us");

            Iterator iterator = games.descendingIterator();
            while (iterator.hasNext()) {
                System.out.print(" " + iterator.next());
            }
            System.out.println();
            for (int i = games.size() -1;i<=0;i--){
                System.out.print(", " + games.get(i));
            }
        }
    }


//5. Write a Java program to insert the specified element at the specified position in the linked list.
    public static class Question5{
        public static void main(String[] args) {
            LinkedList<String> colors = new LinkedList<>();
            colors.add("Blue");
            colors.add("Red");
            colors.add("Green");
            colors.add("Black");
            colors.add("Purple");
            colors.add("Orange");
            colors.add("Yellow");

            colors.add(3, "Pink");
            System.out.println(colors);
        }
    }
}

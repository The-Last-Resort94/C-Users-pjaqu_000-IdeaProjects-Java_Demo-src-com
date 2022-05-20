package com.Week1RevatureTraining.Day2JavaFundamentalsCont.Exercises;

import java.util.Scanner;

class Day2Exercises{
// Write a program to sum first n even numbers using a while loop.
    public static class Question2 {
        public static void main(String[] args) {
            int sum = 0;
            int n = 1;
            int numMax=10;
            while (n<=numMax){
                sum = sum +(2*n);
                n++;
            }
            System.out.println("Sum of even number is: "+ sum);
    }
}

// Write a program to print the multiplication table of a given number n.
    public static class Question3 {
        public static void main(String[] args) {
            int number = 1;
            for(int i=1; i<=10;i++){
                System.out.println(number + "x" + i + "=" + number * i);
            }
        }
    }

// Write a program to print a multiplication table of 10 in reverse order.
    public static class Question4 {
        public static void main(String[] args) {
            int number =10;
            for (int i=10;i>=1;i--){
                System.out.println(number + "x" + i + "=" + number * i);
            }
        }
    }

// Write a program to find the factorial of a given number using for loops.
    public static class Question5 {
        public static void main(String[] args) {
            int n = 1;
            int num = 6;
            for (int i=num;i>0;i--){
                n = n * i;
            }
            System.out.println("Factorial of "+ num + " = "+ n);
        }
    }

//Repeat problem 5 using a while loop
    public static class Question6 {
        public static void main(String[] args) {
            int num = 6;
            int factorial = 1;
            int i = 1;
            while (i<=num){
                factorial=factorial*i;
                i++;
            }
            System.out.println("The factorial of " + num + " = " + factorial);
        }
    }

//What can be done using one type of loop can also be done using the other tw types of loops. True or False?
    public static class Question8 {
        public static void main(String[] args) {
            System.out.println("True");
        }
    }

//Write a program to calculate the sum of numbers occurring in the multiplication table of 8.
    public static class Question9 {
        public static void main(String[] args) {
            int n = 8;
            int Max = 12;
            int sum = 0;
            int i;
            for (i = 0; i <= Max; i++) {
                sum += n * i;
                System.out.println(n + " x " + i + " = " + n * i);
            }

            System.out.println("Sum of all products = " + sum);
        }
    }


}
package com.Week3RevatureTraining.Day12;

import java.io.*;
import java.util.Scanner;


class Exercises {

//1. Write a Java program to get a list of all file/directory names from the given.
    public static class Q1{
        public static void main(String[] args) {

            File file = new File("db");
            String[] list = file.list();
            for (int i=0; i<list.length; i++) {
                System.out.println(list[i]);
            }
        }
    }

//2. Write a Java program to get specific files by extensions from a specified folder.
    public static class Q2{
        public static void main(String[] args) {
            File file = new File("data3.txt");
            String fileName = file.toString();
            int index = fileName.lastIndexOf('.');
            if (index > 0){
                String extension = fileName.substring(index + 1);
                System.out.println("File extension is " + extension);
            }
        }
    }

//3. Write a Java program to check if a file or directory specified by pathname exists or not.
    public static class Q3{
        public static void main(String[] args) {
            File file = new File("db2");
            System.out.println(file.exists());
        }
    }

//4. Write a Java program to check if given pathname is a directory or a file.
    public static class Q4{
        public static void main(String[] args) {
            File file = new File("db");
            System.out.println(file.isDirectory());
        }
    }

//5. Write Java program to read input from java console.
    public static class Q5{
        public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String console = read.readLine();
            System.out.println(console);
        }
    }

//6. Write a Java program to read a file content line by line.
    public static class Q6{
        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("C:\\Users\\pjaqu_000\\IdeaProjects\\Java_Demo\\db");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }

//7. Write a Java program to read first 3 lines from a file.
    public static class Q7{
        public static void main(String[] args) {

        }
    }

//8. Write a Java program to find the longest word in a text file.
    public static class Q8{
        public static void main(String[] args) {

        }
}

}

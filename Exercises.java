package com.Day1JavaFundamentals.Day1Exercises;


class Exercises{

static class Exercise1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // new line
        }
    }
}

static class Exercise2 {
    public static void main(String[] args) {

        for(int i=5;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println(); // new line
            }
        }
    }

static class Exercise3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

static class Exercise4 {
    public static void main(String[] args) {
        int n=3;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (int j=i;j<n;j++){
                System.out.print("* ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

static class Exercise5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

static class Exercise6 {
    public static void main(String[] args) {
       int a = 25;
       int b = 78;
       int c = 87;
        System.out.println("The greatest: "+ c);
    }
}

static class Exercise7 {
    public static void main(String[] args) {
        System.out.println("5*0 = 0");
        System.out.println("5*1 = 5");
        System.out.println("5*2 = 10");
        System.out.println("5*3 = 15");
        System.out.println("5*4 = 20");
        System.out.println("5*5 = 25");
    }
}

static class Exercise8 {
    public static void main(String[] args) {
        int n = 10;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

static class Exercise9 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
            }
        }
    }

static class Exercise10 {
    public static void main(String[] args) {
        int n = 6;
        for (int i=1;i<n;i++) {
            for (int j=i;j<=n;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}}
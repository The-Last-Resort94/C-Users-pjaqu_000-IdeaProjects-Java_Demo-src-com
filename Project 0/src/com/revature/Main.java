package com.revature;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        BankDao bankDao = BankDaoFactory.getBankDao();
        UserPortalDao userPortalDao = UserPortalDaoFactory.getUserPortalDao();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("--------------------");
            System.out.println("Login to Portal");
            System.out.println("--------------------");
            System.out.println("Press 1: Login");


            int input = scanner.nextInt();
            switch (input) {
                case 1: {//login
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Password: ");
                    int password = Integer.scanner.next();
                    if

                }
            }
        }
    }
}

package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice = -1;
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Print the rectangle");
                    String a = "";
                    for (int i = 0; i < 3; i++) {
                        a += "*" + "  ";
                        for (int j = 0; j < 6; j++) {
                            a += "*" + "  ";
                        }
                        a += "\n";
                    }
                    System.out.println(a);
                    break;
                }
                case 2: {
                    System.out.println("Print the square triangle");
                    String a = "";
                    for (int i = 1; i <= 5; i++) {
                        a += "\n";
                        for (int j = 1; j < i + 1; j++) {
                            a += "*";
                        }
                    }
                    a += "\n";
                    for (int i = 5; i >= 1; i--) {
                        a += "\n";
                        for (int j = 1; j < i + 1; j++) {
                            a += "*";
                        }
                    }
                    System.out.println(a);
                    break;
                }
                case 3: {
                    System.out.println("Print isosceles triangle");
                    String a = "";
                    for (int i = 1; i <= 7; i++) {
                        a += "\n";   // in xuống dòng
                        for (int j = 1; j <= 7 - i; j++) {    // khoan cach giua moi dong
                            a += " ";
                        }
                        for (int j = 0; j < i - 1; j++) {     // ve tu 1 -7
                            a += "*";
                        }
                        for (int j = i; j <= 2 * i - 1; j++) {    // ve tu  vi tri 8 -14
                            a += "*";
                        }
                    }
                    System.out.println(a);
                    break;
                }
            }
        }
       while (choice == 4);

        }
    }



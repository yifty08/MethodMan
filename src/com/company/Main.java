package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        answer();
    }

    private static void answer() {
            System.out.println("choose one from the below methods:\t");
            System.out.println("1.add two numbers.");
            System.out.println("2.devide 1st number by 2nd number.");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    add();
                    break;
                case 2:
                    devide();
                    break;
            }
    }

    private static boolean menu() {
        System.out.print("Would you like to go back to main menu? ");
        String choose = scanner.next();
//        Boolean choose = scanner.nextBoolean();
//            choose.compareToIgnoreCase("yes")
        while(choose.equalsIgnoreCase("yes")) {
            answer();
            return true;
        }
        return  false;
//        return true;
    }

    private static void add() {
        int num1;
        int num2;
        int sum;

        System.out.print("Enter two integers to calculate their sum: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println(sum);

        menu();


    }

    private static void devide() {
        System.out.println("Enter 2 numbers, 1st number devided by 2nd number: ");
    }


}

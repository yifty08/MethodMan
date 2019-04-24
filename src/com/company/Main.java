package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ask();
    }

    private static void ask() {
            System.out.println("choose one from the below methods:\t");
            System.out.println("1.add two numbers.");
            System.out.println("2.divide 1st number by 2nd number.");
            System.out.println("3.sorting 5 letters.");
//            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    divide();
                    break;
                case 3:
                    sorting();
                    break;
            }
    }

    private static boolean menu() {
        System.out.print("Would you like to go back to main menu? ");
        String answer = scanner.next();
//        Boolean answer = scanner.nextBoolean();
//            answer.compareToIgnoreCase("yes")
        while(answer.equalsIgnoreCase("yes") ||
                answer.equalsIgnoreCase("y")) {
            ask();
            return true;
        }
        return  false;
//        return true;
    }

    private static void add() {
//        int num1;
//        int num2;
//        int sum;

        System.out.print("Enter two integers to calculate their sum: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        menu();
    }

    private static void divide() {
//        int num1,num2, remainder;

        System.out.println("Enter 2 numbers, 1st number devided by 2nd number: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int remainder = num1 / num2;
        System.out.println(remainder);

        menu();
    }

    public static void sorting() {
        ArrayList<String> lettersAL = new ArrayList<String>();
        String answer = "y";
//        boolean bool = new boolean[true];
        System.out.println("do you want to enter letters to be sorted? ");
        answer = scanner.nextLine();
        while(answer.equalsIgnoreCase("y")) {
            System.out.println("enter a letter to be sorted: ");
            String letters = scanner.nextLine();
            lettersAL.add(letters);

            System.out.println("Your letter is " + '\"' + letters + '\"' + ".");
            System.out.print("Enter another letter? ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("q")) {

            }

        }

//        System.out.println("print out letters array list: " + lettersAL);
//        for (int i=5; i>=1; i--) {
//            System.out.println("Enter " + i + " letters and let me sort it for you: ");
//
//        }

//        String letters = scanner.nextLine();

//        ArrayList<String> lettersArr = new ArrayList<String>();
    }


}

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3};
//        System.out.println(arr[3]);

        Scanner scanner = new Scanner(System.in);


        while(true) {
            int input1, input2;
            try {
                System.out.println("Give a number");
                input1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Give a second number");
                input2 = scanner.nextInt();
                int result = input1 / input2;
                System.out.println(result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number");
                System.out.println("Try again\n");
                scanner.nextLine();
            } catch (ArithmeticException arithmeticException) {
                System.out.println("You cannot divide by 0");
                System.out.println("Try again\n");
            }

        }

    }
}
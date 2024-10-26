package com.example.Projects.calculator;

import java.util.Scanner;

public class CalculatorImpl {

    public static void main(String[] args) {
        getStartingPrompt();
        Scanner input = new Scanner(System.in);
        int operationType = input.nextInt();
        System.out.println("Please enter 2 numbers to perform this operation on");
        System.out.println("enter 1st number");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();
        int result = 0;
        switch (operationType){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 % num2;
                break;
            default:
                System.out.println("invalid operation type");
        }
        System.out.println("Operation result is :" + result);
    }

    private static void getStartingPrompt(){
        System.out.println("You have entered calculator \n" +
            "Enter choice of operation you want to perform:\n" +
            "1. Addition\n" +
            "2. Subtraction\n" +
            "3. Multiplication\n" +
            "4. Division\n");
    }
}

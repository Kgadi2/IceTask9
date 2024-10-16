/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask9;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class IceTask9 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        double num1, num2;
        int choice;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        do {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                    break;
                case 3:
                    if (num2 != 0) {
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 4:
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Calculation not recognized");
            }
        } while (choice != 0);

        sc.close();   
    }
}

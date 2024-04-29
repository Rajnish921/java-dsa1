package com.rajnish;
import java.util.Scanner;

public class tech{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read an integer

        // Prompt the user to enter a double value
        System.out.print("Enter a double value: ");
        double value = scanner.nextDouble(); // Read a double

        // Display the input values
        System.out.println("Hello, " + name + "!");
        System.out.println("You entered the integer: " + number);
        System.out.println("You entered the double value: " + value);

        // Close the scanner to release system resources
        scanner.close();
    }
}




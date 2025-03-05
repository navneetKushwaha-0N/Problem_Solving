//If any two numbers are equal, print "Two numbers are equal" and display the largest number.

import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking  input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Finding the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Checking conditions
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Two numbers are equal");
            System.out.println("Largest number: " + largest);
        } else {
            System.out.println("No two numbers are equal.");
            System.out.println("Largest number: " + largest);
        }

        scanner.close();
    }
}

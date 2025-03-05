import java.util.Scanner;

public class DifferentNoSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Finding the largest and smallest number
        int largest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));

        // Checking conditions
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Two numbers are equal");
            System.out.println("Largest number: " + largest);
        } else {
            System.out.println("All numbers are different");
            System.out.println("Smallest number: " + smallest);
        }

        scanner.close();
    }
}

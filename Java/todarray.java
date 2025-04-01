import java.util.Scanner;

public class todarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (rows and columns): ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        // Taking input for the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element at index (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array in a matrix format
        System.out.println("\nThe 2D array in matrix format:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");  // \t for spacing like a matrix
            }
            System.out.println();  // Move to the next row
        }

        sc.close(); // Close the scanner
    }
}

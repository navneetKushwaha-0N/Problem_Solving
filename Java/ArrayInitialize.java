import java.util.Scanner;

public class ArrayInitialize{
    public static void main(String [] args){
        int Size, i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");   
        Size = sc.nextInt();
        System.out.println("The Size of the array is: " +Size);
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[Size];
        for(i=0; i<Size; i++){
            System.out.println("Enter the element at position "+i);
            arr[i] = sc.nextInt();

            }
            System.out.print("The elements of the array are: " );
            for(i=0; i<Size; i++){
                System.out.print(arr[i] + " ");

        }
       
        
    }
}
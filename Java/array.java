import java.util.Scanner;
public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] =new int[size];


        //input
        System.out.println("Enter the elements");
        for(int i=0; i< arr.length; i++){
            arr[i] =sc.nextInt();
        }

        //output
        System.out.println("The elements is: " );
        for(int i=0; i< arr.length; i++){
           System.out.println(+arr[i]);
        }

    }
}
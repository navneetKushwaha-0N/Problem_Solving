public class ArrayMissingElement {
    public static int findMissingElement(int[] array, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("The missing element is: " + findMissingElement(array, n));
    }
}
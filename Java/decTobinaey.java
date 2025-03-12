public class decTobinaey {
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimal = 10;
        System.out.println("Binary representation of " + decimal + " is: " + decimalToBinary(decimal));
    }
}
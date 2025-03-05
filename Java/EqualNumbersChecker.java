
//It all three numbers are equal, print "All numbers are equal"

public class EqualNumbersChecker {
    public static void main(String[] args) {
        int num1 = 5, num2 = 5, num3 = 5;

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}

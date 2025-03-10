

public class EquilibriumArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int n = arr.length;
        int equilibriumIndex = -1;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
        }

        if (equilibriumIndex != -1) {
            System.out.println("The equilibrium index is " + equilibriumIndex);
        } else {
            System.out.println("There is no equilibrium index.");
        }
    }
}

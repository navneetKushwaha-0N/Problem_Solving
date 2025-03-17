public class rowWiseswapping {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        swapRows(matrix, 0, 2);

        System.out.println("Matrix after swapping row 0 and row 2:");
        printMatrix(matrix);
    }
    public static void swapRows(int[][] matrices, int row1, int row2) {
        int[] temp = matrices[row1];
        matrices[row1] = matrices[row2];
        matrices[row2] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
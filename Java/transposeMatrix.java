public class transposeMatrix {
    public static void transpose(int[][] matrix, int row, int col) {
        int[][] transposed = new int[col][row]; 
  
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        // Print Transposed Matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        transpose(matrix, row, col);
    }
}

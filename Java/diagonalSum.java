public class diagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][i];
            System.out.println("The sum of the diagonal elements of the matrix is: " + sum);
        }

       
        for (int i = 0; i < row; i++) {
            sum += matrix[i][row - i - 1];
           
            System.out.println("The sum of the off-diagonal elements of the matrix is: " + sum);
        }

        
    }
}

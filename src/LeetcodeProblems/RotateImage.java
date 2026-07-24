package LeetcodeProblems;

public class RotateImage {

    public void rotate90Clockwise(int[][] matrix, int n) {

        // Step 1: Transpose
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {
            int startCol = 0;
            int endCol = n - 1;

            while (startCol < endCol) {
                int temp = matrix[i][startCol];
                matrix[i][startCol] = matrix[i][endCol];
                matrix[i][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RotateImage obj = new RotateImage();
        obj.rotate90Clockwise(matrix, matrix.length);

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
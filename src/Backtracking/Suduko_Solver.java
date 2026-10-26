
package Backtracking;

import java.util.Scanner;

public class Suduko_Solver {

    static boolean findEmptyCell(char[][] board, int[] emptyCell) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isSafeToPlace(char[][] board, char charValue,
                                 int rowIndex, int colIndex) {

        // Check row
        for (int col = 0; col < 9; col++) {
            if (board[rowIndex][col] == charValue) {
                return false;
            }
        }

        // Check column
        for (int row = 0; row < 9; row++) {
            if (board[row][colIndex] == charValue) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = rowIndex - rowIndex % 3;
        int startCol = colIndex - colIndex % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int actualRow = startRow + i;
                int actualCol = startCol + j;

                if (board[actualRow][actualCol] == charValue) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solveSudokuHelper(char[][] board) {
        int[] emptyCell = new int[2];

        // No empty cell means Sudoku is solved
        if (!findEmptyCell(board, emptyCell)) {
            return true;
        }

        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for (int value = 1; value <= 9; value++) {
            char charValue = (char) (value + '0');

            if (isSafeToPlace(board, charValue, rowIndex, colIndex)) {
                board[rowIndex][colIndex] = charValue;

                if (solveSudokuHelper(board)) {
                    return true;
                }

                // Backtracking
                board[rowIndex][colIndex] = '.';
            }
        }

        return false;
    }

    public static void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[9][9];

        System.out.println("Enter Sudoku (use '.' for empty cells):");

        for (int i = 0; i < 9; i++) {
            String row = sc.next();

            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        if (solveSudokuHelper(board)) {
            System.out.println("Solved Sudoku:");

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }

        sc.close();
    }
}

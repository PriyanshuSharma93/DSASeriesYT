package Basicsofjava.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class WavePrintAMatrix {

    public List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {

        List<Integer> results = new ArrayList<>();

        for (int col = 0; col < n; col++) {

            if ((col & 1) == 1) {
                // Odd column -> Bottom to Top
                for (int row = m - 1; row >= 0; row--) {
                    results.add(matrix[row][col]);
                }
            } else {
                // Even column -> Top to Bottom
                for (int row = 0; row < m; row++) {
                    results.add(matrix[row][col]);
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        WavePrintAMatrix obj = new WavePrintAMatrix();

        List<Integer> ans = obj.wavePrintMatrix(matrix, 3, 3);

        System.out.println(ans);
    }
}
package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class SumofEachRowin2dArray {

    public List<Integer> rowSum(int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int row = 0; row < m; row++) {

            int sum = 0;

            for (int col = 0; col < n; col++) {
                sum += arr[row][col];
            }

            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SumofEachRowin2dArray obj = new SumofEachRowin2dArray();

        List<Integer> ans = obj.rowSum(arr);

        System.out.println(ans);
    }
}
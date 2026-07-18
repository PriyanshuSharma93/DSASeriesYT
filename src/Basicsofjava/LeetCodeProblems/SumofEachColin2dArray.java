package Basicsofjava.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class SumofEachColin2dArray {

    public List<Integer> colSum(int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int col= 0; col < m; col++) {

            int sum = 0;

            for (int row = 0; row < n; row++) {
//                int value = arr[row][col];
                sum =sum+arr[row][col];
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

        SumofEachColin2dArray obj = new SumofEachColin2dArray();

        List<Integer> ans = obj.colSum(arr);

        System.out.println(ans);
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public static void solve(int[] candidates, int target, int index,
                             List<List<Integer>> ans,
                             List<Integer> output, int count) {

        // Base case
        if (target == 0 && output.size() == count) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Stop conditions
        if (index >= candidates.length || target < 0
                || output.size() >= count) {
            return;
        }

        // Pick current element
        output.add(candidates[index]);

        solve(candidates, target - candidates[index],
                index + 1, ans, output, count);

        // Backtrack
        output.remove(output.size() - 1);
        // Not pick current element
        solve(candidates, target, index + 1,
                ans, output, count);
    }
    public static List<List<Integer>> combinationsum(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        solve(candidates, n, 0, ans, output, k);
        return ans;
    }
    public static void main(String[] args) {
        int k = 3;
        int n = 8;
        List<List<Integer>> ans = combinationsum(k, n);
        System.out.println(ans);
    }
}


package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void solve(int[] candidates, int target, int index,
                             List<List<Integer>> ans,
                             List<Integer> output) {

        // Base case
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }
        // Pick current element
        output.add(candidates[index]);
        solve(candidates, target - candidates[index],
                index + 1, ans, output);
        // Backtrack
        output.remove(output.size() - 1);
        // Skip duplicate elements
        while (index + 1 < candidates.length
                && candidates[index] == candidates[index + 1]) {
            index++;
        }
        // Not pick current element
        solve(candidates, target, index + 1, ans, output);
    }
    public static List<List<Integer>> combinationsum(
            int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, ans, output);
        return ans;
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> ans = combinationsum(candidates, 8);
        System.out.println(ans);
    }
}

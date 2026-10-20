package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSumI {
    public static void solve(int[] candidates,int target,int index,
                             List<List<Integer>> ans ,List<List<Integer>> output){
//        base case
        if(target==0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        output.add(Collections.singletonList(candidates[index]));
        solve(candidates,target-candidates[index],index,ans,output);

        output.remove(output.size()-1);

        solve(candidates, target, index+1, ans, output);

    }

    public static List<List<Integer>> combinationsum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        int index=0;
        solve(candidates,target,index,ans,output);
        return ans;
    }
    public static void main(String args[]){
        int[] candidates={2,3,6,7};
        List<List<Integer>> ans=CombinationSumI.combinationsum(candidates,7);
        System.out.println(ans);
    }
}

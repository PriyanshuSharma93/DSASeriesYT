package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void solve(int[] nums,int index,List<Integer> output,List
                      <List<Integer>>ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int currValue=nums[index];
        output.add(currValue);
        solve(nums,index+1,output,ans);
        output.remove(output.size()-1);

        solve(nums,index+1,output,ans);
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index=0;
        solve(nums,index,output,ans);
        return ans;
    }
    public static void main(String args[]) {
        int nums[]={1,2,3};
        List<List<Integer>> ans =Subsets.subsets(nums);
        System.out.println(ans);
    }
}

package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        for(int index=0;index<n;index++){
            int value =Math.abs(nums[index]);
            int position =value-1;

            if(nums[position]>0){
                nums[position]=-nums[position];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int valueAtThisIndex=i+1;
                ans.add(valueAtThisIndex);
            }
        }
       return ans;
        }
    public static  void main(String args[]){
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        MissingElement obj = new MissingElement();
        List<Integer> result = obj.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}

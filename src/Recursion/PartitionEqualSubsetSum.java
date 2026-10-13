package Recursion;

public class PartitionEqualSubsetSum {
    public static boolean solve(int target, int[] nums, int index){
        if(target == 0){
            return true;
        }if(target < 0){
            return false;
        }
        if(index >= nums.length){
            return false;
        }

        boolean includeKaAns=solve(target-nums[index],nums,index+1);
        boolean excludeKaAns=solve(target,nums,index+1);

        return includeKaAns||excludeKaAns;
    }
    public static boolean canPartition(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int index=0;
        int target=sum/2;
        boolean ans=solve(target,nums,index);
        return ans;
    }
    public static void main(String args[]) {
//        int nums[]={1,5,11,5};---true
        int nums[]={1,2,3,5};
        boolean ans=canPartition(nums);
        System.out.println(ans);


    }
}

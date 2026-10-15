package Recursion;

public class Jump_Game_Problem {
    public static boolean solve(int[] nums,int index){
//        base case
        if(index==nums.length-1){
            return true;
        }
        if(index>=nums.length){
            return false;
        }
        if(nums[index]==0){
            return false;
        }
        int jumpValue=nums[index];
        boolean overallAns=false;
        for(int jump=1;jump<=jumpValue;jump++){
          boolean recAns=solve(nums,index+jump);
          overallAns=overallAns||recAns;
        }
        return overallAns;
    }
    public static boolean can_jump(int[] nums){
        int index=0;
        boolean ans= solve(nums,index);
        return ans;

    }
    public static void main(String[] args) {
//        int[] nums={2,3,1,1,4};-------true
        int[] nums={3,2,1,0,4};
        boolean ans=can_jump(nums);
        System.out.println(ans);

    }
}

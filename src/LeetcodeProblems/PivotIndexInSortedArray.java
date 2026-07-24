package LeetcodeProblems;

public class PivotIndexInSortedArray {
    public static int  Pivot_Index(int[] nums){
            int n=nums.length;
            int s=0;
            int e=n-1;
            int ans =-1;
            if(nums[s]<nums[e]){
                return -1;
            }
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]<=nums[n-1]){
                    e=mid-1;
                }else{
                    ans=mid;
                    s=mid+1;
                }
            }
            return ans ;
    }

    public static void main(String[] args) {
       int[] nums= {3,4,5,1,2};
       int ans= Pivot_Index(nums);
       System.out.println(ans);
    }
}

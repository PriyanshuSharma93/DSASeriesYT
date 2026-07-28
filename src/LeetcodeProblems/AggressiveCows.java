package LeetcodeProblems;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean isValidans(int[] stalls ,int k,int minDistance){
        int cowCount=1;
        int lastPosition=0;

        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-stalls[lastPosition]>=minDistance){
                cowCount++;

                lastPosition=i;
                if(cowCount==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static int aggressivecows(int[] stalls,int k){
        Arrays.sort(stalls);
        int n=stalls.length;

        int start=0;
        int end=stalls[n-1]-stalls[0];
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isValidans(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,8,4,9};
        int ans=aggressivecows(arr,3);
        System.out.println(ans);
    }
}

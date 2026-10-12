package Recursion;

public class Leetcode1981 {
    public static int solve(int sum,int target,int [][] mat,int row){
        if(row>=mat.length){
            return Math.abs(target-sum);
        }
        int mini=Integer.MAX_VALUE;
        for(int num:mat[row]){
            int ans=solve(sum+num,target,mat,row+1);
            mini=Math.min(mini,ans);
        }
        return mini;
    }
    public static int minimizeTheDifference(int[][] mat, int target) {
        int row=0;
        int sum=0;
        int ans =solve(sum,target,mat,row);
        return ans;
    }
    public static void main(String[] args){
        int mat[][]={
                {1},
                {2},
                {3}
        };
       int result= minimizeTheDifference(mat,100);
        System.out.println(result);

    }

}

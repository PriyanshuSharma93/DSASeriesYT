package Recursion;

public class CoinChangeII  {
    public static int solve(int amount,int[] coins,int index){
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(index>=coins.length){
            return 0;
        }
        int includeAns=solve(amount-coins[index],coins,index);
        int excludeAns=solve(amount,coins,index+1);
        int finalAns=includeAns+excludeAns;
        return finalAns;

    }
    public static int change(int amount,int []coins){
        int index=0;
        int ans= solve(amount,coins,index);
        return ans;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4};
        int amount=10;
        CoinChangeII  obj = new CoinChangeII ();
        System.out.println(obj.change(amount,nums));
    }
}

package LeetcodeProblems;

import static LeetcodeProblems.RowWithMaximumones.getFirstOccIndex;

public class RowWithMaximumones {
    public static int getFirstOccIndex(int[][] arr,int rowIndex){
        int totalRows=arr.length;
        int totalCol=arr[0].length;
        int target=1;
        int ans=-1;

        if(arr[rowIndex][totalCol-1]==0){
            return totalCol;
        }
        else{
            int s=0;
            int e=totalCol-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[rowIndex][mid]==0){
                    s=mid+1;
                }
                else{
                    ans=mid;
                    e=mid-1;
                }
            }
        }
        return ans;
    }
    public static int rowWithMaxOnes(int[][] mat){
        int totalRow=mat.length;
        int totalCol=mat[0].length;
        int maxi=-1;
        int maxOneWaliRowIndex=-1;

        for(int row=0;row<totalRow;row++){
            int firstOccIndex=getFirstOccIndex(mat,row);

            int oneCount=totalCol-firstOccIndex;

            if(oneCount!=0 && oneCount >maxi){
                maxi=oneCount;
                maxOneWaliRowIndex=row;
            }

        }
        return maxOneWaliRowIndex;
    }
    public static void main(String[] args) {
        int[][] mat={
                {0,0,0,1},
                {0,0,1,1},
                {0,1,1,1},
                {1,1,1,1}
        };

        int ans= getFirstOccIndex(mat,0);
        System.out.println(ans);
    }
}

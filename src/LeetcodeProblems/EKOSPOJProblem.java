package LeetcodeProblems;

public class EKOSPOJProblem {
    public static boolean isvalidAns(int trees[],int m,int maxHeight){
        int totalWoodCollected=0;
        for(int i=0;i<trees.length;i++){
            if(trees[i]>maxHeight){
                int currentTreeWoodCollected=trees[i]-maxHeight;
                totalWoodCollected+=currentTreeWoodCollected;
            }
        }
        if(totalWoodCollected>=m){
            return true;
        }else{
            return false;
        }

    }
    public static int maxSavHeight(int trees[],int m){
        int n=trees.length;
        int s=0;

        int maxi=-1;
        for(int i=0;i<n;i++){
            if(trees[i]>maxi){
                maxi=trees[i];
            }
        }
        int ans=-1;
        int e=maxi;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(isvalidAns(trees,m,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
      int arr[]={20,15,10,17};
      int ans=maxSavHeight(arr,7);
        System.out.println(ans);
    }

}

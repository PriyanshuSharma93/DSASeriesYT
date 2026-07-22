package SearchingAlgos;

public class GetUpperBound {
    public static int get_Upper_Bound(int[] arr ,  int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]<=target){
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,30,40,50};
        int target=25;
        int ans =get_Upper_Bound(arr,target);
        System.out.println("ans :" + ans);
    }
}

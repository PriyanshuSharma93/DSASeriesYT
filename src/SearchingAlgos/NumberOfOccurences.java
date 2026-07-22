package SearchingAlgos;

public class NumberOfOccurences {
    public static int get_lower_bound(int arr[],int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=n;

        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]>=target){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static int get_Upper_Bound(int[] arr ,  int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=n;

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
        int target=40;
        int lbindex=get_lower_bound(arr,target);
        int ubindex=get_Upper_Bound(arr,target);
        int ans= ubindex-lbindex;
        System.out.println(ans);
    }
}

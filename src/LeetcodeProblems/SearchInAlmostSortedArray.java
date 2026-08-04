package LeetcodeProblems;



public class SearchInAlmostSortedArray{
    public static int findElementNearlysortedArray(int [] arr, int k){
        int n=arr.length;

        int s=0;
        int e=n-1;

        while(s<=e){
            int mid= s+(e-s)/2;

            if(mid-1>=0 && arr[mid-1]==k)
                return mid-1;
            if(mid-1<n &&arr[mid]==k)
                return mid;
            if(arr[mid+1]==k)
                return mid+1;

            if(k>arr[mid]){
                e=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,10,9,11};
        int ans=findElementNearlysortedArray(arr,10);
        System.out.println(ans);
    }
}

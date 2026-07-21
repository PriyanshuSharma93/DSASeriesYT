package SearchingAlgos;

public class BinarySearch {
    public static int  Binary_Search(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;

        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={12,20,30,31,32,34,50,60,70,80,90};
        int ans=Binary_Search(arr,90);
        System.out.println(ans);

    }
}

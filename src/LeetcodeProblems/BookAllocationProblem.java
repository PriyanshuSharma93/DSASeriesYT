package LeetcodeProblems;

public class BookAllocationProblem {
    static boolean isValidAnswer(int arr[],int k,int maxPages){

        int studentCount=1;
        int pages=0;

        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=maxPages){
                pages=pages+arr[i];
            }
            else{
                studentCount++;
                if(studentCount>k|| arr[i]>maxPages){
                    return false;
                }
                else{
                    pages=0;
                    pages=pages+arr[i];
                }
            }
    }
        return true;
}
    public static int Find_pages(int[] arr,int k) {
        int s = 1;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAnswer(arr,k,mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
       int ans= Find_pages(arr,2);
        System.out.println(ans);
    }
}

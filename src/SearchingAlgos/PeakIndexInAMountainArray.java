package SearchingAlgos;
public class PeakIndexInAMountainArray {
    public static int Peak_Index_In_Mountain_Array(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 5, 3, 1};
        int ans = Peak_Index_In_Mountain_Array(arr);
        System.out.println(ans);
    }
}
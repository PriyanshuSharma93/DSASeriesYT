package LeetcodeProblems;

public class SearchInSortedRotatedArray {

    public static int Find_Pivot_Index(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (nums[s] < nums[e]) {
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int Binary_Search(
            int[] arr,
            int start,
            int end,
            int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int Search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = Find_Pivot_Index(nums);
        if (pivotIndex == -1) {
            return Binary_Search(nums, 0, n - 1, target);
        }
        int startArray1 = 0;
        int endArray1 = pivotIndex;

        if (target >= nums[startArray1]
                && target <= nums[endArray1]) {
            return Binary_Search(nums, startArray1, endArray1, target);
        }
        int startArray2 = pivotIndex + 1;
        int endArray2 = n - 1;

        return Binary_Search(nums, startArray2, endArray2, target);
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = Search(nums, target);
        System.out.println("Target Index: " + ans);
    }
}
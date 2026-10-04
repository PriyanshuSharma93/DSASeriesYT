
package Recursion;

public class BinarySearchUsingRecursion {

    public static int solve(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return solve(arr, target, s, mid - 1);
        }

        return solve(arr, target, mid + 1, e);
    }

    public static int binary_Search(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;

        return solve(arr, target, s, e);
    }

    public static void main(String args[]) {
        int arr[] = {10, 11, 16, 20, 30, 40};

        int result = binary_Search(arr, 11);

        System.out.println(result);
    }
}

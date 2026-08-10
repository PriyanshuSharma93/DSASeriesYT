package LeetcodeProblems;

public class UnboundedSearch {

    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = 1;
        while (end < arr.length && arr[end] < target) {
            start = end;
            end = end * 2;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 15, 20, 25, 30, 40, 50, 60};
        int target = 40;
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
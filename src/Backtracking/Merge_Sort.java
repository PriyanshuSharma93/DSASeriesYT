package Backtracking;
import java.util.Scanner;

public class Merge_Sort {

    public static void merge(int arr[], int s, int e, int mid) {

        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        int k = s;

        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }

        k = mid + 1;

        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }

        int i = 0;
        int j = 0;
        k = s;

        while (i < leftArrLen && j < rightArrLen) {

            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }

        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, r, mid);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

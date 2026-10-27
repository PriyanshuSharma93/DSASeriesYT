
package Backtracking;

import java.util.Scanner;

class Inversion_Count {

    static int merge(int arr[], int s, int e, int mid) {
        int leftArrlen = mid - s + 1;
        int rightArrlen = e - mid;

        int[] leftArr = new int[leftArrlen];
        int[] rightArr = new int[rightArrlen];

        for (int i = 0; i < leftArrlen; i++) {
            leftArr[i] = arr[s + i];
        }

        for (int j = 0; j < rightArrlen; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = s;
        int invCount = 0;

        while (i < leftArrlen && j < rightArrlen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                invCount += leftArrlen - i;
            }
        }

        while (i < leftArrlen) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArrlen) {
            arr[k++] = rightArr[j++];
        }

        return invCount;
    }

    static int mergeSort(int arr[], int s, int e) {
        if (s >= e) {
            return 0;
        }

        int mid = s + (e - s) / 2;

        int left = mergeSort(arr, s, mid);
        int right = mergeSort(arr, mid + 1, e);
        int intermediate = merge(arr, s, e, mid);

        return left + right + intermediate;
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

        int ans = mergeSort(arr, 0, n - 1);

        System.out.println("Inversion Count: " + ans);

        sc.close();
    }
}

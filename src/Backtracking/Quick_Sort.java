
package Backtracking;

import java.util.Scanner;

public class Quick_Sort {

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivotElement = arr[low];
        int count = 0;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }

        int correctPosition = low + count;

        int temp = arr[correctPosition];
        arr[correctPosition] = arr[low];
        arr[low] = temp;

        int i = low;
        int j = high;

        while (i < correctPosition && j > correctPosition) {
            while (i < correctPosition && arr[i] <= pivotElement) {
                i++;
            }

            while (j > correctPosition && arr[j] > pivotElement) {
                j--;
            }

            if (i < correctPosition && j > correctPosition) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return correctPosition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Quick_Sort obj = new Quick_Sort();
        obj.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

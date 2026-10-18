package Recursion;
class Subsequence_With_Sum_K {
    public static boolean solve(int arr[], int k, int sum, int index) {
        if (index >= arr.length) {
            if (sum == k)
                return true;
            else
                return false;
        }
        int currValue = arr[index];
        boolean excludeKaAns = solve(arr, k, sum, index + 1);
        boolean includeKaAns = solve(arr, k, sum + currValue, index + 1);
        boolean finalAns = includeKaAns || excludeKaAns;
        return finalAns;
    }

    public static boolean checkSubsequenceSum(int[] arr, int k) {

        int index = 0;
        int sum = 0;
        boolean ans = solve(arr, k, sum, index);
        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        Subsequence_With_Sum_K obj = new Subsequence_With_Sum_K();
        boolean ans=Subsequence_With_Sum_K.checkSubsequenceSum(arr, 14);
        System.out.println(ans);
    }
}

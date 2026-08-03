package LeetcodeProblems;

public class RotiParathaProblem {

    // Check if it is possible to cook required parathas within given time
    public static boolean isValidAns(int totalParathas, int[] cooks, int totalCooks, int timeLimit) {

        int parathaCount = 0;

        for (int i = 0; i < totalCooks; i++) {

            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;

            while (true) {
                timeTaken += j * currentCookRank;
                if (timeTaken <= timeLimit) {
                    parathaCount++;
                    j++;
                } else {
                    break;
                }
            }
            if (parathaCount >= totalParathas) {
                return true;
            }
        }
        return false;
    }
    public static int minTimeToCookParathas(int p, int[] cooks, int n) {
        int maxRank = -1;
        for (int i = 0; i < n; i++) {
            maxRank = Math.max(maxRank, cooks[i]);
        }
        int start = 0;
        int end = maxRank * (p * (p + 1) / 2);
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValidAns(p, cooks, n, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] cooks = {1, 2, 3, 4};
        int totalParathas = 10;
        int ans = minTimeToCookParathas(totalParathas, cooks, cooks.length);
        System.out.println("Minimum Time Required = " + ans);
    }
}
//package LeetcodeProblems;
//
//public class SquareRootUsingBinarySearch {
//    public static int mysqrt(int x){
//        int s=0;
//        int e=x;
//        int ans =-1;
//
//        while(s<=e){
//            int mid=s+(e-s)/2;
//
//            if(mid*mid==x){
//                return mid;
//            }
//            else if(mid*mid>x){
//                e=mid-1;
//            }
//            else{
//                ans=mid;
//                s=mid+1;
//            }
//            return ans;
//
//    }
//    public static void  main(String[] args) {
//            double ans =mysqrt(56);
//        System.out.println(ans);
//    }
//}

package LeetcodeProblems;

public class SquareRootUsingBinarySearch {

    public static double mySqrt(int x) {

        int s = 0;
        int e = x;
        double ans = -1;

        // Binary Search for integer part
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }
            else if ((long) mid * mid > x) {
                e = mid - 1;
            }
            else {
                ans = mid;
                s = mid + 1;
            }
        }
        double factor = 1;
        int totalPrecision = 3;
        for (int round = 1; round <= totalPrecision; round++) {
            factor = factor / 10;
            for (int i = 1; i <= 9; i++) {
                double newAns = ans + factor;
                if (newAns * newAns <= x) {
                    ans = newAns;
                }
                else {
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        double ans = mySqrt(56);
        System.out.println(ans);
    }
}

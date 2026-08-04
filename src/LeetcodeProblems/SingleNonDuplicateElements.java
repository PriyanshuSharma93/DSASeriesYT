package LeetcodeProblems;

public class SingleNonDuplicateElements {

    public static int single_Non_Duplicate(int[] nums) {

        int n = nums.length;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            if (s == e) {
                return nums[s];
            }

            int mid = s + (e - s) / 2;

            int currentValue = nums[mid];

            int preValue = Integer.MIN_VALUE;
            if (mid - 1 >= 0) {
                preValue = nums[mid - 1];
            }

            int nextValue = Integer.MIN_VALUE;
            if (mid + 1 < n) {
                nextValue = nums[mid + 1];
            }

            // Current element is the answer
            if (currentValue != preValue && currentValue != nextValue) {
                return currentValue;
            }

            // Pair starts at mid
            if (currentValue != preValue && currentValue == nextValue) {

                int startingIndexOfPair = mid;

                if ((startingIndexOfPair & 1) == 1) {
                    e = mid - 1;
                } else {
                    s = mid + 2;
                }
            }

            // Pair ends at mid
            else if (currentValue == preValue && currentValue != nextValue) {

                int endingIndexOfPair = mid;

                if ((endingIndexOfPair & 1) == 1) {
                    s = mid + 1;
                } else {
                    e = mid - 2;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(single_Non_Duplicate(nums1)); // 2

        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(single_Non_Duplicate(nums2)); // 10

        int[] nums3 = {1};
        System.out.println(single_Non_Duplicate(nums3)); // 1

        int[] nums4 = {1, 1, 2};
        System.out.println(single_Non_Duplicate(nums4)); // 2

        int[] nums5 = {0, 1, 1, 2, 2};
        System.out.println(single_Non_Duplicate(nums5)); // 0
    }
}
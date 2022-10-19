/*
You are given two integer arrays nums1 and nums2.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */

public class MergeAndSortArrays {

    public static int[] mergeAndSortArrays(int[] nums1, int[] nums2) {
        return sortArray(mergeArrays(nums1, nums2));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            merged[nums1.length + j] = nums2[j];
        }

        return merged;
    }

    private static int[] sortArray(int[] nums) {
        int[] sorted = new int[nums.length];

        for (int i = 0; i < sorted.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            sorted[i] = min;
            nums[minIndex] = Integer.MAX_VALUE;
        }
        return sorted;
    }
}

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
*/

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    if (i < j) {
                        result[0] = i;
                        result[1] = j;
                    } else {
                        result[0] = j;
                        result[1] = i;
                    }
                }
            }
        }
        return result;
    }
}
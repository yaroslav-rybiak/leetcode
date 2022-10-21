public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        //1. Take first number, compare to each other
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                //2. If found pair, take next number
                if (nums[i] == nums[j] && i!=j) break;
                //3. If came to an end, and no pair was found, return current number
                if (j == nums.length - 1) {
                    return nums[i];
                }
            }
        }
        //4. If nothing was found, return last number
        return nums[nums.length - 1];
    }
}

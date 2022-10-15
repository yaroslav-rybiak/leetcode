/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
 */

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        //no last 9, just increment last digit
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        //all 9s, we need a larger array
        int nineNum = 0;
        for (int digit : digits) {
            if (digit == 9) nineNum++;
        }
        if (nineNum == digits.length) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }

        //last 9, and maybe more 9s
        digits[digits.length-1]=0;
        digits[digits.length-2]++;
        for(int i = digits.length-1; i>0; i--) {
            if(digits[i] ==10) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        return digits;
    }
}

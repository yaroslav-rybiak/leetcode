/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        else if(x<10) return true;
        else {
            String intString = String.valueOf(x);
            for(int i = 0; i < intString.length()/2; i++) {
                if(intString.charAt(i) != intString.charAt(intString.length()-1-i)) return false;
            }
        }
        return true;
    }
}

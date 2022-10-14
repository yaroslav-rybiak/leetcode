/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] sArray = s.split(" ");

        return sArray[sArray.length-1].length();
    }
}

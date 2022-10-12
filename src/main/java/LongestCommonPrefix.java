/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */

import java.util.HashSet;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String result = "";
        int shortestLength = shortestWordLength(strs);
        for(int i = 0; i < shortestLength; i++) {
            HashSet<Character> charSet = new HashSet<>();
            for (int j = 0; j < strs.length; j++) {
                charSet.add(strs[j].charAt(i));
            }
            if(charSet.size()==1) result+=strs[0].charAt(i);
            else break;
            charSet.clear();
        }
        return result;
    }

    public static int shortestWordLength(String[] strs){
        int minLength=Integer.MAX_VALUE;
        for(int i=0; i< strs.length; i++) {
            if(strs[i].length()<minLength) {
                minLength = strs[i].length();
            }
        }
        return minLength;
    }
}

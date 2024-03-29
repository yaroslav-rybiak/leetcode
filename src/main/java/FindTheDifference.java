/*
You are given two strings s and t.
String t is generated by random shuffling string s and then add one more letter at a random position.
Return the letter that was added to t.
 */

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        for(char c: s.toCharArray()) {
            if(t.indexOf(c) != -1) {
                t= t.replaceFirst(String.valueOf(c), "");
            }
        }
        return t.charAt(0);
    }
}

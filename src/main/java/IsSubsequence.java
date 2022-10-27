public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        for(int i = 0; i< s.length(); i++) {
            int j = t.indexOf(s.charAt(i));
            if(j==-1) return false;
            t = t.substring(j+1);
        }
        return true;
    }
}

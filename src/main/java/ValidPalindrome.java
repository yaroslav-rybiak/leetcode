public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(s).reverse();
        return s.equals(reverse.toString());
    }
}

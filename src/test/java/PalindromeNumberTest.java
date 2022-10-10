import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testPalindromeNumber() {
        Assert.assertTrue(PalindromeNumber.isPalindrome(0));
        Assert.assertTrue(PalindromeNumber.isPalindrome(9));
        Assert.assertFalse(PalindromeNumber.isPalindrome(10));
        Assert.assertTrue(PalindromeNumber.isPalindrome(11));
        Assert.assertFalse(PalindromeNumber.isPalindrome(12));
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
        Assert.assertFalse(PalindromeNumber.isPalindrome(122));
        Assert.assertFalse(PalindromeNumber.isPalindrome(-121));
        Assert.assertTrue(PalindromeNumber.isPalindrome(1001));
        Assert.assertFalse(PalindromeNumber.isPalindrome(1002));

    }
}

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        String[] listA = {"dog","racecar","car"};
        String[] listB = {"test"};
        String[] listC = {"flower","flow","flight"};
        String[] listD = {"flower","flow",""};
        String[] listE = {"cir","car"};
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(listA));
        Assert.assertEquals("test", LongestCommonPrefix.longestCommonPrefix(listB));
        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(listC));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(listD));
        Assert.assertEquals("c", LongestCommonPrefix.longestCommonPrefix(listE));
    }
}

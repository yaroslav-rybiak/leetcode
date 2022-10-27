
import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void testIsSubsequence(){

        Assert.assertTrue(IsSubsequence.isSubsequence("abc", "asfbfagc"));
        Assert.assertTrue(IsSubsequence.isSubsequence("", "asfbfagc"));
        Assert.assertFalse(IsSubsequence.isSubsequence("abc", "asfbfag"));
        Assert.assertFalse(IsSubsequence.isSubsequence("acb", "asfbcfag"));
        Assert.assertFalse(IsSubsequence.isSubsequence("acb", ""));
        Assert.assertFalse(IsSubsequence.isSubsequence("acb", "ahbgdc"));
        Assert.assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}

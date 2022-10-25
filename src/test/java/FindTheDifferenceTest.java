import org.junit.Assert;
import org.junit.Test;

public class FindTheDifferenceTest {

    @Test
    public void findTheDifferenceTest() {
        Assert.assertEquals('a', FindTheDifference.findTheDifference("b", "ab"));
        Assert.assertEquals('e', FindTheDifference.findTheDifference("abcd", "abcde"));
        Assert.assertEquals('t', FindTheDifference.findTheDifference("", "t"));
        Assert.assertEquals('a', FindTheDifference.findTheDifference("a", "aa"));
    }
}

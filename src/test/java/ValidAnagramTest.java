import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void testValidAnagram() {

        Assert.assertFalse(ValidAnagram.isAnagram("aacc", "cacc"));
        Assert.assertTrue(ValidAnagram.isAnagram("car", "arc"));
        Assert.assertTrue(ValidAnagram.isAnagram("car", "arc"));
        Assert.assertTrue(ValidAnagram.isAnagram("s", "s"));
        Assert.assertFalse(ValidAnagram.isAnagram("car", "tar"));
        Assert.assertFalse(ValidAnagram.isAnagram("s", "t"));
    }
}

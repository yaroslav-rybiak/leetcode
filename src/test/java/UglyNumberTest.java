import org.junit.Assert;
import org.junit.Test;

public class UglyNumberTest {

    @Test
    public void testUglyNumber() {
        Assert.assertFalse(UglyNumber.isUgly(0));
        Assert.assertTrue(UglyNumber.isUgly(1));
        Assert.assertTrue(UglyNumber.isUgly(2));
        Assert.assertTrue(UglyNumber.isUgly(3));
        Assert.assertTrue(UglyNumber.isUgly(4));
        Assert.assertTrue(UglyNumber.isUgly(5));
        Assert.assertTrue(UglyNumber.isUgly(6));
        Assert.assertFalse(UglyNumber.isUgly(7));
        Assert.assertTrue(UglyNumber.isUgly(8));
        Assert.assertTrue(UglyNumber.isUgly(9));
        Assert.assertTrue(UglyNumber.isUgly(10));
        Assert.assertFalse(UglyNumber.isUgly(11));
        Assert.assertTrue(UglyNumber.isUgly(12));
        Assert.assertFalse(UglyNumber.isUgly(13));
        Assert.assertFalse(UglyNumber.isUgly(14));
        Assert.assertFalse(UglyNumber.isUgly(-1000));
        Assert.assertFalse(UglyNumber.isUgly(-2147483648));

    }
}

import org.junit.Assert;
import org.junit.Test;

public class SquareRootTest {

    @Test
    public void testSquareRoot() {
        Assert.assertEquals(0, SquareRoot.mySqrt(0));
        Assert.assertEquals(1, SquareRoot.mySqrt(1));
        Assert.assertEquals(1, SquareRoot.mySqrt(2));
        Assert.assertEquals(1, SquareRoot.mySqrt(3));
        Assert.assertEquals(2, SquareRoot.mySqrt(4));
        Assert.assertEquals(2, SquareRoot.mySqrt(5));
        Assert.assertEquals(2, SquareRoot.mySqrt(6));
        Assert.assertEquals(2, SquareRoot.mySqrt(7));
        Assert.assertEquals(2, SquareRoot.mySqrt(8));
        Assert.assertEquals(3, SquareRoot.mySqrt(9));
        Assert.assertEquals(4, SquareRoot.mySqrt(16));
        Assert.assertEquals(46340, SquareRoot.mySqrt(2147395600));
        Assert.assertEquals(46340, SquareRoot.mySqrt(2147483647));

    }
}

import org.junit.Assert;
import org.junit.Test;

public class TwoSumsTest {

    private final int[] a = {2, 7, 11, 15};
    private final int aTarget = 9;
    private final int[] aOutput = {0, 1};

    private final int[] b = {3, 2, 4};
    private final int bTarget = 6;
    private final int[] bOutput = {1, 2};

    private final int[] c = {3, 3};
    private final int cTarget = 6;
    private final int[] cOutput = {0, 1};

    @Test
    public void testTwoSums() {
        Assert.assertArrayEquals(TwoSums.twoSum(a, aTarget), aOutput);
        Assert.assertArrayEquals(TwoSums.twoSum(b, bTarget), bOutput);
        Assert.assertArrayEquals(TwoSums.twoSum(c, cTarget), cOutput);
    }

}

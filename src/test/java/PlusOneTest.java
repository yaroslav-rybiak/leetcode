import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PlusOneTest {

    @Test
    public void testPlusOne() {

        int[] ar1 = {1, 2, 3};
        int[] ex1 = {1, 2, 4};

        int[] ar2 = {9};
        int[] ex2 = {1, 0};

        int[] ar3 = {9, 9, 9};
        int[] ex3 = {1, 0, 0, 0};

        int[] ar4 = {1, 9};
        int[] ex4 = {2, 0};

        int[] ar5 = {1, 8, 9, 9};
        int[] ex5 = {1, 9, 0, 0};

        Assert.assertArrayEquals(ex1, PlusOne.plusOne(ar1));
        Assert.assertArrayEquals(ex2, PlusOne.plusOne(ar2));
        Assert.assertArrayEquals(ex3, PlusOne.plusOne(ar3));
        Assert.assertArrayEquals(ex4, PlusOne.plusOne(ar4));
        Assert.assertArrayEquals(ex5, PlusOne.plusOne(ar5));

    }
}

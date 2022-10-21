import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() {
        int[] arr1 = {1};
        int[] arr2 = {1,2,2};
        int[] arr3 = {2,1,2};
        int[] arr4 = {2,2,1};
        int[] arr5 = {4,1,2,1,2};

        Assert.assertEquals(1, SingleNumber.singleNumber(arr1));
        Assert.assertEquals(1, SingleNumber.singleNumber(arr2));
        Assert.assertEquals(1, SingleNumber.singleNumber(arr3));
        Assert.assertEquals(1, SingleNumber.singleNumber(arr4));
        Assert.assertEquals(4, SingleNumber.singleNumber(arr5));
    }
}

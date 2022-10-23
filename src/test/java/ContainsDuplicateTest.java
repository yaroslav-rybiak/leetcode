import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() {
        int[] num1 = {1,2,3,4,1};
        int[] num2 = {1,2,3,1};
        int[] num3 = {1,2,3,4};
        int[] num4 = {1,1};
        int[] num5 = {1,2};
        int[] num6 = {1};
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(num1));
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(num2));
        Assert.assertFalse(ContainsDuplicate.containsDuplicate(num3));
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(num4));
        Assert.assertFalse(ContainsDuplicate.containsDuplicate(num5));
        Assert.assertFalse(ContainsDuplicate.containsDuplicate(num6));
    }
}

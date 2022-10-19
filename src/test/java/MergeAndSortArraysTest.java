import org.junit.Assert;
import org.junit.Test;

public class MergeAndSortArraysTest {

    @Test
    public void testMergeAndSortArrays() {
        int[] nums11 = {1, 2, 3};
        int[] nums12 = {4, 5, 6};
        int[] result1 = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(result1, MergeAndSortArrays.mergeAndSortArrays(nums11, nums12));

        int[] nums21 = {1, 2, 3};
        int[] nums22 = {2, 5, 6};
        int[] result2 = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(result2, MergeAndSortArrays.mergeAndSortArrays(nums21, nums22));

        int[] nums31 = {1};
        int[] nums32 = {};
        int[] result3 = {1};
        Assert.assertArrayEquals(result3, MergeAndSortArrays.mergeAndSortArrays(nums31, nums32));

        int[] nums41 = {};
        int[] nums42 = {1};
        int[] result4 = {1};
        Assert.assertArrayEquals(result4, MergeAndSortArrays.mergeAndSortArrays(nums41, nums42));
    }
}

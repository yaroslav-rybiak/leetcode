import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if(nums==null) return false;
        if(nums.length<=1) return false;
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (numsSet.contains(num)) return true;
            else numsSet.add(num);
        }
        return false;
    }
}

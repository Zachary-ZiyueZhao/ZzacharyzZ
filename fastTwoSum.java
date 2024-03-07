import java.util.*;
public class fastTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                index[0] = i;
                index[1] = map.get(nums[i]);
                return index;
            }
            map.put(target - nums[i], i);
        }
        return index;
    }
}

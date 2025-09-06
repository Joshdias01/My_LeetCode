package Arrays;

import java.util.HashMap;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> ind = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // if(nums[i]<target)
            // {
            //     ind.put(nums[i],i);
            // }
            ind.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int y = target - nums[i];
            if (ind.containsKey(y) && ind.get(y) != i) {
                return new int[]{i, ind.get(y)};
            }
        }
        return new int[]{};
    }
}

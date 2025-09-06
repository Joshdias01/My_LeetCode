package Arrays;

public class CountHillValleys_2210 {
    public int countHillValley(int[] nums) {
        if (nums.length == 1 || nums.length == 2) {
            return 0;
        }
        int count = 0, i = 0;
        for (int j = 1; j < nums.length - 1; j++) {
            // if(nums[j]==nums[j-1])
            // {
            //     j++;
            // }
            if (nums[i] < nums[j] && nums[j] > nums[j + 1] || nums[i] > nums[j] && nums[j] < nums[j + 1]) {
                count++;
                i = j;
            }
        }
        return count;
    }
}

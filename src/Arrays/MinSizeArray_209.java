package Arrays;

public class MinSizeArray_209 {
    public int minSubArrayLen(int target, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return 1;
        }
        int left, right, min, sum = 0;
        right = 0;
        left = 0;
        min = Integer.MAX_VALUE;
        for (right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }
        if (min == Integer.MAX_VALUE)
            return 0;
        return min;
    }

}

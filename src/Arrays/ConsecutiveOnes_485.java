package Arrays;

public class ConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, count = 0, max = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            i++;
            max = Math.max(count, max);
        }
        return max;
    }

}

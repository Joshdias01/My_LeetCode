package Arrays;

public class MaxConsecutiveOnes_1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, count = 0;
        int length = 0;
        while (right < nums.length) {
            if (nums[right] == 0)
                count++;

            while (count > k) {
                if (nums[left] == 0)
                    count--;
                left++;
            }


            length = Math.max(length, right - left + 1);
            right++;
        }
        return length;
    }
}

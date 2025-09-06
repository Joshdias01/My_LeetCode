package Arrays;

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;
        int temp, flag = 1;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                flag = 0;
        }
        if (flag == 1)
            return;
        i = 0;
        while (j < nums.length) {
            if (nums[i] != 0) {
                i++;
            } else if (nums[j] == 0 || j < i) {
                j++;
            } else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}

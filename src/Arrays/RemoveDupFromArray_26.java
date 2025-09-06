package Arrays;

public class RemoveDupFromArray_26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        while (i < j && j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                j++;
            } else if (nums[i] == nums[j]) {
                j++;
            }
        }
        return i + 1;
    }
}

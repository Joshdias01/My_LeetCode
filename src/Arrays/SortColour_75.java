package Arrays;

public class SortColour_75 {
    public void sortColors(int[] nums) {
        int zeroCount, oneCount, twoCount;
        zeroCount = 0;
        oneCount = 0;
        twoCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeroCount++;
            else if (nums[i] == 1)
                oneCount++;
            else
                twoCount++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                nums[i] = 0;
                zeroCount--;
            } else if (oneCount > 0) {
                nums[i] = 1;
                oneCount--;
            } else {
                nums[i] = 2;
                twoCount--;
            }
        }
    }

}

package Arrays;

public class RearrangeArrayElement_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int m = 0, n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg[m++] = nums[i];
            } else {
                pos[n++] = nums[i];
            }
        }
        //System.out.println(Arrays.toString(pos));
        m = 0;
        n = 0;
        for (int i = 0; i < nums.length; ) {
            nums[i++] = pos[m++];
            nums[i++] = neg[n++];
        }
        return nums;
    }

}

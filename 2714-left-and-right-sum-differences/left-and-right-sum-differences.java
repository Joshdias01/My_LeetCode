class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0,left=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            total-=n;
            nums[i]=Math.abs(total-left);
            left+=n;
        }
        return nums;
    }
}
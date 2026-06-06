class Solution {
    public int findSpecialInteger(int[] nums) {
        int i=nums.length/4;
        for(i=nums.length/4;i<nums.length;i++){
            if(nums[i]==nums[i-(nums.length/4)]){
                return nums[i];
            }
        }
        return -1;
    }
}
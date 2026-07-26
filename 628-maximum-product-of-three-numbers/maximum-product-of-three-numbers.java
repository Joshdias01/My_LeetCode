class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long prod=1;
        prod=nums[0]*nums[1]*nums[2];
        prod=Math.max(prod,nums[n-1]*nums[n-2]*nums[n-3]);
        prod=Math.max(prod,nums[0]*nums[n-1]*nums[n-2]);
        prod=Math.max(prod,nums[0]*nums[1]*nums[n-1]);
        return (int)prod;
    }
}
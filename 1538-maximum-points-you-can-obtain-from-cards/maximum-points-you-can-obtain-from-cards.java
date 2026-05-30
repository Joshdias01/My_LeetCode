class Solution {
    public int maxScore(int[] nums, int k) {
        int len=nums.length-k,sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(k==nums.length) max=Math.max(sum,max);
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            if(i-j+1==len){
                max=Math.max(max,sum);
                sum=sum+nums[j];
                j++;
            }
        }
        return max;
    }
}
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int i=nums.length-1;
        while(k!=0){
            int num=nums[i--];
            if(mul!=0){
                sum+=(long)mul*(long)num;
                mul--;
            }else{
                sum+=(long)num;
            }
            k--;
        }
        return sum;
    }
}
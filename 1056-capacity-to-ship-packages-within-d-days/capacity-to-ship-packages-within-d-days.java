class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int low=0,high=0;
        for(int i:nums){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(checkDays(nums,mid)<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int checkDays(int[] nums,int n){
        int days=1,load=0;
        for(int i=0;i<nums.length;i++){
            if(load+nums[i]>n){
                days++;
                load=nums[i];
            }else{
                load+=nums[i];
            }
        }
        return days;
    }
}
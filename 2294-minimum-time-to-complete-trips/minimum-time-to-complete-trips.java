class Solution {
    public long minimumTime(int[] nums, int totalTrips) {
        long low=1,high=Long.MAX_VALUE;
        for(int i:nums){
            high=Math.min(high,i);
        }
        high=high*totalTrips;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(check(nums,mid,totalTrips)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int[] nums,long mid,int total){
        long count=0;
        for(int i:nums){
            count+=(long)(mid/i);
        }
        return count>=total;
    }
}
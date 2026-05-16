class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        Arrays.sort(nums);
        int ans=-1;
        int low=1,high=nums[nums.length-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(count(mid,nums)<=h){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int count(int num,int[] nums){
        int n=nums.length;
        int time=0;
        for(int i=0;i<n;i++){
            time+=Math.ceil((double)nums[i]/(double)num);
        }
        return time;
    }
}
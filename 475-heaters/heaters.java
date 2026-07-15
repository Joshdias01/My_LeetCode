class Solution {
    public int findRadius(int[] nums, int[] heaters) {
        Arrays.sort(nums);
        Arrays.sort(heaters);
        int low=0,high=1_000_000_000;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(mid,nums,heaters)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean check(int mid,int[] nums,int[] heaters){
        int j=0,n=heaters.length;
        int minCurr=Math.abs(nums[0]-heaters[j]);
        for(int i=0;i<nums.length;i++){
            minCurr=Math.abs(nums[i]-heaters[j]);
            while(j+1<n && Math.abs(heaters[j+1]-nums[i])<=minCurr){
                j++;
                minCurr=Math.abs(nums[i]-heaters[j]);
            }
            if(minCurr>mid) 
                return false;
        }
        return true;
    }
}
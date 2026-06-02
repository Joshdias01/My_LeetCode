class Solution {
    public int maxDistance(int[] nums, int m) {
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1]-nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkDist(nums,mid,m)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean checkDist(int[] nums,int mid,int m){
        int count=1,prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-prev>=mid){
                prev=nums[i];
                count++;
            }
            if(count==m) return true;
        }
        return false;
    }
}
class Solution {
    public int minimizedMaximum(int n, int[] nums) {
        int low=1,high=0;
        for(int i:nums){
            if(i>high){
                high=i;
            }
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(checkDist(nums,mid,n)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean checkDist(int[] nums,int mid,int n){
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=Math.ceil((double)nums[i]/mid);
        }
        if(count<=n){
                return true;
            }
        return false;
    }
}
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int lb=findLb(nums,target);
        int ub=findUb(nums,target);
        if(lb<nums.length && lb>=0 && nums[lb]==target){
            for(int i=lb;i<ub;i++){
                ans.add(i);
            }
        }
        return ans;
    }
    int findLb(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    int findUb(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
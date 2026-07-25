class Solution {
    public int findTheDistanceValue(int[] nums1, int[] nums2, int d) {
        Arrays.sort(nums2);
        int count=0;
        for(int i=0;i<nums1.length;i++){
            int diff=binarySearch(nums2,nums1[i]);
            if(diff>d){
                count++;
            }
        }
        return count;
    }
    int binarySearch(int[] nums,int n){
        int low=0,high=nums.length-1;
        int diff=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=n){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        diff=(low<nums.length && low>=0)? Math.abs(nums[low]-n):Math.abs(nums[low-1]-n);
        diff=Math.min((low-1>=0)? Math.abs(nums[low-1]-n):diff,diff);
        return diff;
    }
}
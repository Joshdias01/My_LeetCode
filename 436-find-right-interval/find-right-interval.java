class Solution {
    public int[] findRightInterval(int[][] nums) {
        int[][] vals = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            vals[i][0] = i;
            vals[i][1] = nums[i][0];
        }
        int[] ans=new int[nums.length];
        Arrays.sort(vals, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i][0];
            int end = nums[i][1];
            ans[i] = findStart(vals, end);
        }
        return ans;
    }
    int findStart(int[][] nums,int end){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid][1]>=end){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(low>=nums.length){
            return -1;
        }
        return nums[low][0];
    }
}
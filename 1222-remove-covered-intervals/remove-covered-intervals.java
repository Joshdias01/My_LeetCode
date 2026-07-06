class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }else{
                return Integer.compare(a[0],b[0]);
            }
        });
        int n=nums.length,count=0;
        for(int i=0;i<n;){
            int j=i+1;
            while(j<n && nums[i][0]<=nums[j][0] && nums[i][1]>=nums[j][1]){
                count++;
                j++;
            }
            i=j;
        }
        return n-count;
    }
}
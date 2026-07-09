class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans=new boolean[queries.length];
        int[] components=new int[nums.length];
        int comp=0;
        components[0]=comp;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                components[i]=comp;
            }else{
                comp++;
                components[i]=comp;
            }
        }
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(components[start]==components[end]){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        return ans;
    }
}
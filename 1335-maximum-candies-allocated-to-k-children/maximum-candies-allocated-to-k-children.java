class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }
        int ans=0;
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long actualPiles = 0;
            for (int i=0;i<candies.length;i++) {
                actualPiles+=candies[i]/mid;
            }
            if(actualPiles>=k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
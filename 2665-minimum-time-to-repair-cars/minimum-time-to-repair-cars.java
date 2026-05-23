class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low=Integer.MAX_VALUE;
        long high=0;
        for(int i:ranks){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        low=1;
        high=high*cars*cars;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(checkCars(ranks,mid)>=cars){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static long checkCars(int[] nums,long n){
        long count=0;
        for(int i=0;i<nums.length;i++){
            count+=(long)Math.sqrt((long)n/nums[i]);
        }
        return count;
    }
}
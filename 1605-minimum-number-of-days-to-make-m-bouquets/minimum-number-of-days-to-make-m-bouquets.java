class Solution {
    public int minDays(int[] nums, int m, int k) {
        int min=Integer.MAX_VALUE,max=0;
        long siz=(long)m*k;
        if(siz>nums.length){
            return -1;
        }
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int low=min,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(nums,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static boolean check(int[] nums,int mid,int m,int k){
        int count=0,boq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }else{
                count=0;
            }
            if(count==k){
                boq++;
                count=0;
            }
        }
        return (boq>=m)? true:false;
    }
}
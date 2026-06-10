class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int i:nums){
            low=Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int check(int[] nums,int mid){
        int count=0,no=1;
        for(int i:nums){
            if(count+i>mid){
                no++;
                count=i;
            }else{
                count+=i;
            }
        }
        return no;
    }
}
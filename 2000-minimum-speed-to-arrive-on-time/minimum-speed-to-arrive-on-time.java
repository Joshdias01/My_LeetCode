class Solution {
    public int minSpeedOnTime(int[] nums, double hour) {
        int low=1,high=10000000;
        for(int i:nums){
            high=Math.max(i,high);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid,hour)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean check(int[] nums,int mid,double hour){
        double hr=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                hr+=(nums[i]+mid-1)/mid;
            }else{
                hr+=((double)nums[i]/(double)mid);
            }
        }
        System.out.println(mid+" "+hr);
        return (hr<=hour);
    }
}
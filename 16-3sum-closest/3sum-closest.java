class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,k=nums.length-1;
        int diff=nums[0]+nums[1]+nums[2];
        while(i<nums.length){
            int j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                int mod=Math.abs(sum-target);
                if(Math.abs(sum-target)<Math.abs(diff-target)){
                    diff=sum;
                }
                if (sum<target) {
                    j++; 
                }else{
                    k--;
                }
            }
            i++;
        }
        return diff;
    }
}
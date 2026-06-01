class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int count=1,sum=0;
        for(int i=nums.length-1;i>=0;i--){
            if(count==3){
                count=1;
            }else{
                sum+=nums[i];
                count++;
            }
            System.out.println(sum+" "+nums[i]);
        }
        return sum;
    }
}
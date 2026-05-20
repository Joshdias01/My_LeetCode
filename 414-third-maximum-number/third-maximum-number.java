class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int max=nums[i];
        int count=1;
        while(i>=0){
            if(nums[i]==max){
                i--;
            }else if(nums[i]!=max){
                max=nums[i];
                count++;
                i--;
            }
            if(count==3){
                break;
            }
        }
        return (count!=3)? nums[nums.length-1]:max;
    }
}
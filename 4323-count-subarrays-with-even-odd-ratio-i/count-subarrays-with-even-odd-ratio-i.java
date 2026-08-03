class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int x=0,y=0,count=0;
        for(int i=0;i<nums.length;i++){
            x=0;y=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    x++;
                }else{
                    y++;
                }
                if(x*b<=y*a){
                    count++;
                }
            }
        }

        return count;
    }
}
class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
        int count=0;
        for(int n:nums){
            if(n%2!=0)
                count++;
            else
                count=0;
            if(count==3)
                return true;
        }
        return false;
    }
}
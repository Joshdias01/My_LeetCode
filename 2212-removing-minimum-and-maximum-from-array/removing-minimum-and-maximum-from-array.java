class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int minIdx=-1,maxIdx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
        }
        int n=nums.length;
        int countLeft=Integer.MAX_VALUE,countRight=Integer.MAX_VALUE;
        countLeft=Math.min(countLeft,Math.min(maxIdx,minIdx)+1);
        countRight=Math.min(countRight,n-Math.max(minIdx,maxIdx));
        int countFront=Math.max(minIdx,maxIdx)+1;
        int countBack=n-Math.min(minIdx,maxIdx);
        return Math.min(countLeft+countRight,Math.min(countFront,countBack));
    }
}
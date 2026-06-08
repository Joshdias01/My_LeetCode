class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int eqCount=0,smCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)
                eqCount++;
            if(nums[i]==pivot)
                smCount++;
        }
        int[] result = new int[nums.length];
        for(int i=eqCount;i<eqCount+smCount;i++)
            result[i]=pivot;
        int fwd=eqCount+smCount;
        int j=0;
        for(int i:nums){
            if(i<pivot)
                result[j++]=i;
            if(i>pivot)
                result[fwd++]=i;
        }
        return result;
    }
}
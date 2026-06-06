class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer,Integer> mapRight= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mapRight.put(nums[i],mapRight.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer> mapLeft=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mapLeft.put(nums[i],mapLeft.getOrDefault(nums[i],0)+1);
            mapRight.put(nums[i],mapRight.get(nums[i])-1);
            if(mapRight.get(nums[i])<=0){
                mapRight.remove(nums[i]);
            }
            nums[i]=mapLeft.size()-mapRight.size();
        }
        return nums;
    }
}
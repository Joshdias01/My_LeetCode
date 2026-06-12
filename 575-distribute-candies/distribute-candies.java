class Solution {
    public int distributeCandies(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int candies=nums.length/2;
        if(candies>set.size()){
            return set.size();
        }
        return candies;
    }
}
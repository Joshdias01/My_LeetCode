class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
        }
        int size=set.size();
        set = new HashSet<>(map.values());
        if(set.size()==size)
            return true;
        return false;
    }
}
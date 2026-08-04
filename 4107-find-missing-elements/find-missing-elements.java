class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
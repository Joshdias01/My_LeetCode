class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int pairs=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pairs+=entry.getValue()/2;
        }
        return pairs==(nums.length/2);
    }
}
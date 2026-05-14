class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i>max)
                max=i;
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(nums.length!=max+1){
            return false;
        }
        for(int i=1; i<=max; i++){
            if(!map.containsKey(i)) 
                return false;
            
            if(i == max && map.get(i) != 2)
                return false;
                
            if(i < max && map.get(i) != 1)
                return false;
        }
        return true;
    }
}
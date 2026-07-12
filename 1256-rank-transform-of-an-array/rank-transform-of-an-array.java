class Solution {
    public int[] arrayRankTransform(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=1;
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count++);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}
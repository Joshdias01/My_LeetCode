class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
            map.put(nums2[i],i);
        
        for(int i=0;i<nums1.length;i++){
            int j=map.get(nums1[i]);
            List<Integer> set = new LinkedList<>();
            for(int k=j+1;k<nums2.length;k++){
                set.add(nums2[k]);
            }
            int get=nums1[i];
            for(int k:set){
                if(k>nums1[i]){
                    get=k;
                    break;
                }
            }
            nums1[i]=(get==nums1[i])? -1:get;
        }
        return nums1;
    }
}
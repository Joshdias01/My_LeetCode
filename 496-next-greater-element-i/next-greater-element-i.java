class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
            map.put(nums2[i],i);
        
        for(int i=0;i<nums1.length;i++){
            int j=map.get(nums1[i]);
            int get=nums1[i];
            nums1[i]=-1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>get){
                    nums1[i]=nums2[k];
                    break;
                }
                else 
                    nums1[i]=-1;
            }
            }
        return nums1;
    }
}
class Solution {
    public int longestCommonPrefix(int[] nums1, int[] nums2) {
        HashSet<String> set = new HashSet<>();
        for(int n:nums1){
            while(n!=0){
                set.add(n+"");
                n=n/10;
            }
        }
        int len=0;
        for(int n:nums2){
            while(n!=0){
                if(set.contains(n+"")){
                    String s=n+"";
                    len=Math.max(len,s.length());
                }
                n=n/10;
            }
        }
        return len;
    }
}
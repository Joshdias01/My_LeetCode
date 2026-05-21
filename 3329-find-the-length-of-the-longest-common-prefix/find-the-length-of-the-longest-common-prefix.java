class Solution {
    public int longestCommonPrefix(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums1){
            while(n!=0){
                set.add(n);
                n=n/10;
            }
        }
        int len=0;
        for(int n:nums2){
            int count=0;
            int num=n;
            while(num!=0){
                count++;
                num=num/10;
            }
            while(n!=0){
                if(set.contains(n)){
                    len=Math.max(len,count);
                }
                n=n/10;
                count--;
            }
        }
        return len;
    }
}
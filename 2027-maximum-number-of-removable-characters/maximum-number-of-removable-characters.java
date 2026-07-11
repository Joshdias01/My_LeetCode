class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int low=0,high=removable.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(check(s,p,removable,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    boolean check(String s,String p,int[] nums,int mid){
        int[] removes=new int[s.length()];
        for(int i=0;i<mid;i++){
            removes[nums[i]]=1;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<p.length() && p.charAt(j)==s.charAt(i) && removes[i]==0){
                j++;
            }
        }
        return j==p.length();
    }
}
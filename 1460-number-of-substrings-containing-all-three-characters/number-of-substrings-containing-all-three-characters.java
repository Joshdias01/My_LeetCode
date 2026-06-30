class Solution {
    public int numberOfSubstrings(String s) {
        int lastA=-1,lastB=-1,lastC=-1,ans=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='a') lastA=i;
            else if(curr=='b') lastB=i;
            else lastC=i;
            ans+=Math.min(lastA,Math.min(lastB,lastC))+1;
        }
        return ans;
    }
}
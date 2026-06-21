class Solution {
    public int maxDistance(String s) {
        int x1=0,x2=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(s.charAt(i)=='_'){
                prev++;
            }
            else if(curr=='L'){
                x1--;
            }else if(curr=='D'){
                x2--;
            }else if(curr=='U'){
                x2++;
            }else {
                x1++;
            }
        }
        return Math.abs(0-x1)+Math.abs(0-x2)+prev;
    }
}
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr==y){
                cnt++;
            } 
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<cnt;i++){
            str.append(y);
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr!=y){
                str.append(curr);
            }
        }
        return str.toString();
    }
}
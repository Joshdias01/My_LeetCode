class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='*'){
                if(ans.length()>0){
                    ans.deleteCharAt(ans.length()-1);
                }
            }else if(curr=='#'){
                ans.append(ans.toString());
            }else if(curr=='%'){
                ans=ans.reverse();
            }else{
                ans.append(curr);
            }
        }
        return ans.toString();
    }
}
class Solution {
    public String greatestLetter(String s) {
        HashSet<Integer> set = new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            set.add((int)s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)+32)){
                if((s.charAt(i))>ans){
                    ans=s.charAt(i);
                }
            }
        }
        return (ans!=0)? ((char)ans+""):("");
    }
}
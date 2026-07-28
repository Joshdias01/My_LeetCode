class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        StringBuilder sMid=new StringBuilder();
        Map<Character,Integer> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char curr=entry.getKey();
            int count=entry.getValue();
            int flag=0;
            if(count%2==1){
                sMid.append(curr);
                count--;
            }
            while(count!=0){
                if(flag==0){
                    s1.append(curr);
                    flag=1;
                }else{
                    s2.append(curr);
                    flag=0;
                }
                count--;
            }
        }
        s2.reverse();
        s1.append(sMid);
        s1.append(s2);
        return s1.toString();
    }
}
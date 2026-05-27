class Solution {
    public int numberOfSpecialChars(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr>='a' && curr<='z'){
                map.put(curr,i);
            }else if(!map.containsKey(curr)){
                map.put(curr,i);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char curr=entry.getKey();
            if(curr>='A' && curr<='Z'){
                int low=curr+32;
                if(map.containsKey((char)low)){
                    if(map.get((char)low)<entry.getValue()){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
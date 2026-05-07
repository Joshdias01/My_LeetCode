class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        String[] words= s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(words[i]))
                    return false;
            }else{
                map1.put(ch,words[i]);
            }
            if(map2.containsKey(words[i])){
                if(map2.get(words[i])!=ch)
                    return false;
            }else{
                map2.put(words[i],ch);
            }
            System.out.println(words[i]);
        }
        return true;
    }
}
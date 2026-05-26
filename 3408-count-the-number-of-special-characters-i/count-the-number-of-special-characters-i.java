class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set =  new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                int ch=word.charAt(i);
                int up=ch+32;
                if(set.contains((char)up)){
                    count++;
                    set.remove((char)up);
                }
            }
        }
        return count;
    }
}
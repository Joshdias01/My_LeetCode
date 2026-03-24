class Solution {
    public long countVowels(String word) {
        long count=0;
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i))==1){
                count+=(long)(i+1)*(word.length()-i);
            }
        }
        return count;
    }
    public static int isVowel(char c){
        if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')
            return 1;
        return 0;
    }
}
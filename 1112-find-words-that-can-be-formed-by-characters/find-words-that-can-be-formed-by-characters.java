class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] chrs=new int[26];
        int[] wrds=new int[26];

        for(int i=0;i<chars.length();i++){
            chrs[chars.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            wrds=new int[26];
            for(int j=0;j<words[i].length();j++){
                wrds[words[i].charAt(j)-'a']++;
            }
            int flag=1;
            for(int j=0;j<words[i].length();j++){
                if(wrds[words[i].charAt(j)-'a']>chrs[words[i].charAt(j)-'a']){
                    flag=0;
                }
            }
            if(flag==1){
                count+=words[i].length();
            }
        }
        return count;
    }
}
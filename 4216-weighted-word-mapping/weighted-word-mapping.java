class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            int ch=sum%26;
            int rev=(97+25)-ch;
            s.append(""+(char)(rev));
        }
        return s.toString();
    }
}
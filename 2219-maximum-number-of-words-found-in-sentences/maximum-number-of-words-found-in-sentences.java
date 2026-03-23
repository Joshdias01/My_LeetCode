class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            String[] words=s.split(" ");
            int count=words.length;
            max=Math.max(max,count);
        }
        return max;
    }
}
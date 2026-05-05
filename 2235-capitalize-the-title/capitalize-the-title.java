class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            words[i]=words[i].toLowerCase();
            if(words[i].length()>2){
                ans.append(Character.toUpperCase(words[i].charAt(0)));
                ans.append(words[i].substring(1));
            }else{
                ans.append(words[i]);
            }
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
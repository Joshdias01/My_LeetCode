class Solution {
    public int passwordStrength(String s) {
        int sum=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)) && Character.isLowerCase(s.charAt(i))){
                sum++;
                set.add(s.charAt(i));
            }
            if(!set.contains(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){
                sum+=2;
                set.add(s.charAt(i));
            }
            if(!set.contains(s.charAt(i)) && Character.isDigit(s.charAt(i))){
                sum+=3;
                set.add(s.charAt(i));
            }
            if(!set.contains(s.charAt(i))){
                if(s.charAt(i)=='!' ||s.charAt(i)=='@' ||s.charAt(i)=='#'||s.charAt(i)=='$'){
                sum+=5;
                set.add(s.charAt(i));
                }
            }
        }
        return sum;
    }
}
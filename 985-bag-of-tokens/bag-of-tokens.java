class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,max=0;
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        while(i<=j){
            if(tokens[i]<=power){
                power-=tokens[i];
                score++;
                i++;
                max=Math.max(score,max);
            }
            else if(score>0){
                power+=tokens[j];
                score--;
                j--;
            }else 
            break;
        }
        return max;
    }
}
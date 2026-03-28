class Solution {
    public int minFlips(String s) {
        String c= s+s;

        int c1= 0,c2=0;
        int ans = Integer.MAX_VALUE;
        char exp1='0',exp2='0';
        
        for(int i=0;i<2*s.length() ;i++){

            if(i % 2 == 0){
                exp1='0';
                exp2='1';
            }
            else{
                exp1='1';
                exp2='0';
            }
            if(c.charAt(i) != exp1) 
                c1++;
            if(c.charAt(i) != exp2) 
                c2++;
            int n=s.length();
            if(i>=s.length()){
                char p1='0',p2='0'; 
               if((i-n) % 2 == 0){   //i need to remove behind
                    p1='0';
                    p2='1';
               }
            else{
                p1='1';
                p2='0';
            }
              //i-n->prev
                if(c.charAt(i- n)!=p1) 
                    c1--;
                if(c.charAt(i- n)!=p2) 
                    c2--;
            }
            if(i>=s.length()-1){
                ans = Math.min(ans, Math.min(c1, c2));
            }
        }
        return ans;
    }
}
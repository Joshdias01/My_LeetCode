class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int prod=prodNum(i);
            if(prod%t==0){
                return i;
            }
        }
        return t;
    }
    int prodNum(int n){
        int prod=1;
        while(n!=0){
            prod=prod*(n%10);
            if(prod==0) return 0;
            n=n/10;
        }
        return prod;
    }
}
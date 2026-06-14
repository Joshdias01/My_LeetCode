class Solution {
    public boolean checkGoodInteger(int n) {
        long sum=0,squareSum=0;
        while(n!=0){
            int num=n%10;
            sum+=num;
            squareSum+=(num*num);
            n/=10;
        }
        return squareSum-sum>=50;
    }
}
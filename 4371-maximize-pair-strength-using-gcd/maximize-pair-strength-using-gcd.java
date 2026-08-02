class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long prod=(long)nums[i]*nums[j];
                max=Math.max(max,prod/(long)Math.pow(gcd(nums[i],nums[j]),2));
            }
        }
        return max;
    }
    int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0) return b;
        return a;
    }
}
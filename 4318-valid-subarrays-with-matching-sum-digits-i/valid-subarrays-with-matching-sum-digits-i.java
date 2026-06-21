class Solution {
    int firstDigit(long sum){
        while(sum>=10){
            sum/=10;
        }
        return (int)sum;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int[] arr=nums.clone();
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum%10==x && firstDigit(sum)==x){
                    ans++;
                }
            }
        }
        return ans;
    }
}
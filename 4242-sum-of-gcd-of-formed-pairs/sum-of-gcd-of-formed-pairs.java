class Solution {
    public long gcdSum(int[] nums) {
        int[] pre = new int[nums.length];
        int max=nums[0];
        int j=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
            pre[j++]=gcd(i,max);
        }
        Arrays.sort(pre);
        int i=0;j=pre.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(pre[i],pre[j]);
            i++;
            j--;
        }
        return sum;
    }
    int gcd(int n1,int n2){
        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0)
            return n2;
        return n1;
    }
}
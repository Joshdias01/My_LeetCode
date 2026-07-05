class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i:nums){
            int[] difference=findMax(i);
            int diff=difference[0]-difference[1];
            System.out.println(diff);
            if(diff==max){
                sum+=i;
            }else if(diff>max){
                sum=0;
                sum=sum+i;
                max=diff;
            }
        }
        return sum;
    }
    int[] findMax(int n){
        int max=0,min=Integer.MAX_VALUE;
        while(n!=0){
            max=Math.max(n%10,max);
            min=Math.min(n%10,min);
            n/=10;
        }
        return new int[]{max,min};
    }
}
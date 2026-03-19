class Solution {
    public int countCommas(int n) {
        int count=0;
        if(n<1000)
            return 0;
        while(n>=1000){
            count+=(int)(Math.log10(n)+1)/3;
            if((int)(Math.log10(n)+1)%3==0)
                count--;
            n--;
        }
        System.out.println((int)(Math.log10(1000)+1)/3);
        return count;
    }
}
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        int lowSize=getSize(low);
        int highSize=getSize(high);
        int i=0,j=lowSize,n=s.length();
        while(j<=highSize){
            if(i+j>n){
                i=0;
                j++;
                continue;
            }
            int number=Integer.parseInt(s.substring(i,i+j));
            if(number>=low && number<=high){
                ans.add(number);
            }
            i++;
        }
        return ans;
    }
    int getSize(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
class Solution {
    public long minArraySum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        long sum=0;
        for(int i:nums){
            set.add(i);
            sum+=(long)i;
        }
        for(int num:nums){
            int best = num;

            for(int j = 1; j * j <= num; j++){

                if(num % j == 0){

                    if(set.contains(j)){
                        best = Math.min(best, j);
                    }

                    int other = num / j;

                    if(set.contains(other)){
                        best = Math.min(best, other);
                    }
                }
            }

            sum -= (num - best);
        }
        return sum;
    }
}
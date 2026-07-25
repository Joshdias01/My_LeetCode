class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:aliceSizes){
            sumA+=i;
            set.add(i);
        }
        for(int i:bobSizes){
            sumB+=i;
        }
        int ans=(sumA-sumB)/2;
        for(int i:bobSizes){
            if(set.contains(ans+i)){
                return new int[]{ans+i,i};
            }
        }
        return new int[]{-1,-1};
    }
}
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list  = new ArrayList<>();
        for(int n:nums){
            String s=Integer.toString(n);
            int i=0;
            while(i!=s.length()){
                list.add(Integer.parseInt(s.charAt(i)+""));
                i++;
            }
        }
        int[] ans= new int[list.size()];
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);

        return ans;
    }
}
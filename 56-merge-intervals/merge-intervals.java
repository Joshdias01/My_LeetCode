class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }else{
                int max=Math.max(intervals[i][1],ans.get(ans.size()-1)[1]);
                ans.get(ans.size()-1)[1]=max;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
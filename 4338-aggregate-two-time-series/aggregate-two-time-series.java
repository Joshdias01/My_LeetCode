class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();
        int n1=series1.length;
        int n2=series2.length;
        int i=0,j=0;
        while(i<n1 && j<n2){
            int t1=series1[i][0];
            int t2=series2[j][0];
            int v1=series1[i][1];
            int v2=series2[j][1];
            if(t1==t2){
                List<Integer> list=new ArrayList<>();
                list.add(t1);
                list.add(v1+v2);
                ans.add(list);
                i++;
                j++;
            }
            else if(t1<t2){
                List<Integer> list=new ArrayList<>();
                list.add(t1);
                list.add(v1+v2);
                ans.add(list);
                i++;
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(t2);
                list.add(v1+v2);
                ans.add(list);
                j++;
            }
        }
        while(i<n1){
            List<Integer> list=new ArrayList<>();
            list.add(series1[i][0]);
            list.add(series1[i][1]);
            ans.add(list);
            i++;
        }
        while(j<n2){
            List<Integer> list=new ArrayList<>();
            list.add(series2[j][0]);
            list.add(series2[j][1]);
            ans.add(list);
            j++;
        }
        return ans;
    }
}
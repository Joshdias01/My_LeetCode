class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->
            Integer.compare(b[1]-b[0],a[1]-a[0])
        );
        int sum=0,curr=0;
        for(int i=0;i<tasks.length;i++){
            int req=tasks[i][1];
            if(curr<req){
                int s=(req-curr);
                curr=curr+(req-curr);
                sum=sum+s;
            }
            curr=curr-tasks[i][0];
        }
        return sum;
    }
}
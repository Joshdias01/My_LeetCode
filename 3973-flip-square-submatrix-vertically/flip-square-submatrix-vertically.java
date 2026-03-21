class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n=grid.length,curr=x+k-1;
        int count=0;
        for(int i=x;i<curr;i++){
            count=0;
            for(int j=y;count<k;j++,count++){
                int temp=grid[i][j];
                grid[i][j]=grid[curr][j];
                grid[curr][j]=temp;
            }
            curr--;
        }
        return grid;
    }
}
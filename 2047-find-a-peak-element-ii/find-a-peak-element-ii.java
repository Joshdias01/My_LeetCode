class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int idx=findMax(matrix,mid,n);
            int left=(mid-1>=0)? matrix[idx][mid-1]:-1;
            int right=(mid+1<m)? matrix[idx][mid+1]:-1;
            if(matrix[idx][mid]>left && matrix[idx][mid]>right){
                return new int[]{idx,mid};
            }else if(matrix[idx][mid]>left && matrix[idx][mid]<right){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public int findMax(int[][] matrix,int mid,int n){
        int max=Integer.MIN_VALUE,idx=-1;
        for(int i=0;i<n;i++){
            if(matrix[i][mid]>max){
                idx=i;
                max=matrix[i][mid];
            }
        }
        return idx;
    }
}
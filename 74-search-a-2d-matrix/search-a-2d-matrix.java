class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length,n=matrix.length;
        int low=0,high=m*n -1;
        while(low<=high){
            int mid=(low+high)/2;
            int num=matrix[mid/m][mid%m];
            if(num==target) return true;
            else if(num<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
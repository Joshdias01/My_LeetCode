class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            int low=0,high=m-1;
            if(matrix[i][high]<target){
                continue;
            }else{
                while(low<=high){
                    int mid=(low+high)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(matrix[i][mid]<target){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
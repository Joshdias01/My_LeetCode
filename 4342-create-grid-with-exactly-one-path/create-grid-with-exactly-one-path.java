class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(".");
        }
        ans[0]=s.toString();
        for(int i=1;i<m;i++){
            s=new StringBuilder();
            for(int j=0;j<n-1;j++){
                s.append("#");
            }
            s.append(".");
            ans[i]=s.toString();
        }
        return ans;
    }
}
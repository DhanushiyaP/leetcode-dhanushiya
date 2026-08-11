// Last updated: 8/11/2026, 3:58:24 PM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m =grid.length,n=grid[0].length;
        int dp[]=new int[n];
        int b=1;
        for(int j=0;j<n;j++){
             dp[j]=1;;
            for(int i=0;i<j;i++){
              boolean ok = true;  
                for(int r=0;r<m;r++){
                    if(Math.abs(grid[r][j]-grid[r][i])>limit){
                        ok = false;
                        break;
                    }
                }
                if(ok) dp[j]=Math.max(dp[j],dp[i]+1);
            }
            b=Math.max(b,dp[j]);
            }
        return b;
    }    
}
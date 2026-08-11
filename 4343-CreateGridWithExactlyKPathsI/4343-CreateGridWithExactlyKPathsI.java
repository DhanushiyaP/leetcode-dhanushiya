// Last updated: 8/11/2026, 3:58:10 PM
class Solution {
    public String[] createGrid(int m, int n, int k) {
           long t = comb(m+n-2,m-1);
        if(k>t) return new String[0];
        char[][] g = new char[m][n];
        for(char[] r : g) java.util.Arrays.fill(r,'#');
        if(n>=k){
            int c = n-k;
            for(int j=0;j<n;j++) g[0][j]='.';
            for(int j=c;j<n&& m>1;j++) g[1][j]='.';
            for(int i=2;i<m;i++) g[i][n-1]='.';
        }
        else if(m>=k){
             int r = m-k;
            for(int i=0;i<m;i++) g[i][0]='.';
            for(int i=r;i<m;i++) g[i][1]='.';
            for(int j=2;j<n;j++) g[m-1][j]='.';
        }
        else{
             for(char[] row : g) java.util.Arrays.fill(row,'.');
            g[0][n-1]='#'; g[m-1][0]='#';
        }
        String[] res = new String[m];
        for(int i=0;i<m;i++) res[i]=new String(g[i]);
        return res;
    }
    private long comb(int n,int r){
        r=Math.min(r,n-r);
        long res =1;
        for(int i=0;i<r;i++) res=res*(n-i)/(i+1);
        return res;
    }
}
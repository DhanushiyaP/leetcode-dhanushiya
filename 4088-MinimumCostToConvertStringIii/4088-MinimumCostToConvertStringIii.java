// Last updated: 8/11/2026, 3:58:26 PM
class Solution {
    public int minCost(String s, String t, List<List<String>> r, int[] c) {
        int n = s.length(),m=r.size();
        Object vn = new Object[]{s,t,r,c};
        int[] cost = new int[m];
        for(int i=0;i<m;i++){
            int stars=0;
            for(char ch:r.get(i).get(0).toCharArray())
                if(ch=='*')
                    stars++;
                    cost[i]=c[i]+stars;
        }
        int INF = Integer.MAX_VALUE/2;
        int dp[] = new int[n+1];
        java.util.Arrays.fill(dp,INF);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]>=INF) continue;
            if(s.charAt(i) == t.charAt(i))
                dp[i+1]=Math.min(dp[i+1],dp[i]);
            for(int j=0;j<m;j++){
                String p = r.get(j).get(0),rep = r.get(j).get(1);
                int L=p.length();
                if(i+L>n)
                    continue;
                boolean ok =true;
                for(int k=0;k<L && ok;k++)
                    if(p.charAt(k)!='*'&&p.charAt(k)!=s.charAt(i+k))ok=false;
                if(ok&&t.regionMatches(i,rep,0,L))
                    dp[i+L]=Math.min(dp[i+L],dp[i]+cost[j]);
            }
        }
        return dp[n]>=INF?-1:dp[n];
    }
}
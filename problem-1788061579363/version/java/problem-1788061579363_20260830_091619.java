// Last updated: 8/30/2026, 9:16:19 AM
1class Solution {
2    public int minOperations(int[] nums, int sum) {
3        int INF = 10000000;
4        int[] dp =new int[sum+1];
5        Arrays.fill(dp,INF);
6        dp[0]=0;
7        for(int a : nums){
8            int[] ndp = dp.clone();
9            for(int d=0,x=a;x>0;d++,x/=2){
10                for(int v=x,m=0;v<=sum;v*=2,m++){
11                    for(int s=0;s+v<=sum;s++)
12                       if(dp[s]<INF)
13                           ndp[s+v]=Math.min(ndp[s+v],dp[s]+d+m);
14                    if(v>sum/2)
15                        break;
16                }
17            }
18            dp=ndp;
19        }
20        return dp[sum]==INF?-1:dp[sum];
21    }
22}
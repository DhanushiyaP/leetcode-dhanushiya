// Last updated: 8/30/2026, 9:09:54 AM
1class Solution {
2    public int minOperations(int[] nums, int sum) {
3        int INF = 10000000;
4        int[] dp =new int[sum+1];
5        Arrays.fill(dp,INF);
6        dp[0]=0;
7        for(int a : nums){
8            int[] ndp = dp.clone();
9            for(int v=a,c=0;v>0;v/=2,c++){
10                for(int s=0;s+v<=sum;s++){
11                    if(dp[s]<INF)
12                        ndp[s+v]=Math.min(ndp[s+v],dp[s]+c);
13                }
14            }
15             for(int v=a,c=0;v<=sum;v*=2,c++)
16                for(int s=0;s+v<=sum;s++)
17                    if(dp[s]<INF)
18                        ndp[s+v]=Math.min(ndp[s+v],dp[s]+c);
19                dp=ndp;    
20        }
21        return dp[sum]==INF ?-1:dp[sum];
22    }
23}
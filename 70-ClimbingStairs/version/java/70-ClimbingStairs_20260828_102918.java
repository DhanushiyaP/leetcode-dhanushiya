// Last updated: 8/28/2026, 10:29:18 AM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n];
5        dp[0]=cost[0];
6        dp[1]=cost[1];
7
8        for(int i=2;i<n;i++){
9            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
10        }
11        return Math.min(dp[n-1],dp[n-2]);
12    }
13}
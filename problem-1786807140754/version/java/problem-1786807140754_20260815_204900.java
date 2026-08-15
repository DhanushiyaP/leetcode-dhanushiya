// Last updated: 8/15/2026, 8:49:00 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int ans=Integer.MAX_VALUE;
5        for(int rot=0;rot<n;rot++)
6        {
7            int op=rot;
8            for(int i=0;i<n/2;i++){
9                char left=s.charAt((i+rot)%n);
10                char right=s.charAt((n-1-i+rot)%n);
11                int diff=(right-left+26)%26;
12                op+=Math.min(diff,26-diff);
13            }
14            ans=Math.min(ans,op);
15        }    
16         return ans;
17    }
18}
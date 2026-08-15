// Last updated: 8/15/2026, 8:41:02 PM
1class Solution {
2    public int elevatorRequests(int n, int[] req) {
3        int cf=0;
4        int tt=0;
5        for(int f:req){
6            tt+=Math.abs(cf-f);
7            cf=f;
8        }
9        return tt;
10    }
11}
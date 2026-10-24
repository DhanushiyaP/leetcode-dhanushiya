// Last updated: 10/24/2026, 8:56:37 PM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        long ans=0,len=0;
4        for(int x : nums){
5            if(x>=minK && x<=maxK) ans += ++len;
6            else len=0;
7        }
8        return ans;
9    }
10}
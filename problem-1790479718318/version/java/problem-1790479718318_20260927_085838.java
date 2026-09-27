// Last updated: 9/27/2026, 8:58:38 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3       int n = nums.length;
4        int base =0;
5        Map<Long, Integer> pairCount = new HashMap<>();
6        for(int i=0;i<n-1;i++){
7            int a = nums[i],b=nums[i+1];
8            if(a==b){
9                base++;
10            }
11            else{
12                int lo = Math.min(a,b), hi =Math.max(a,b);
13                long key = ((long) lo <<32)|(hi & 0xffffffffL);
14                pairCount.merge(key,1,Integer::sum);
15            }
16        }
17        int best = 0;
18        for(int v : pairCount.values()) best=Math.max(best, v);
19        return base + best;
20    }
21}
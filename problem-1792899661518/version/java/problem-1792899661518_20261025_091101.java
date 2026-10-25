// Last updated: 10/25/2026, 9:11:01 AM
1class Solution {
2    public long maximizeSum(int[] nums, int k) {
3        int n = nums.length;
4        long sum =0;
5        long[] gain = new long[n];
6        for(int i=0;i<n;i++){
7            char[] c = String.valueOf(nums[i]).toCharArray();
8            Arrays.sort(c);
9            long max = Long.parseLong(new StringBuilder(new String(c)).reverse().toString());
10            gain[i]=max-nums[i];
11            sum += nums[i];
12        }
13        Arrays.sort(gain);
14        for(int i=0;i<Math.min(k,n);i++) sum +=gain[n-1-i];
15        return sum;
16    }
17}
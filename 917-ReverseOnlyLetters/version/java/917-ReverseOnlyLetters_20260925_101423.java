// Last updated: 9/25/2026, 10:14:23 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5
6        res[0] = 1;
7
8        for (int i = 1; i < n; i++) {
9            res[i] = res[i - 1] * nums[i - 1];
10        }
11
12        int right = 1;
13
14        for (int i = n - 1; i >= 0; i--) {
15            res[i] = res[i] * right;
16            right = right * nums[i];
17        }
18
19        return res;
20    }
21}
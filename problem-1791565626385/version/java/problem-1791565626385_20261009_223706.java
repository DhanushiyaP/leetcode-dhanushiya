// Last updated: 10/9/2026, 10:37:06 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4
5        if (n == 1) {
6            return nums[0];
7        }
8
9        return Math.max(
10            robLinear(nums, 0, n - 2),
11            robLinear(nums, 1, n - 1)
12        );
13    }
14
15    public int robLinear(int[] nums, int i, int j) {
16        int prev2 = 0;
17        int prev1 = 0;
18
19        for (int k = i; k <= j; k++) {
20            int curr = Math.max(prev1, prev2 + nums[k]);
21            prev2 = prev1;
22            prev1 = curr;
23        }
24
25        return prev1;
26    }
27}
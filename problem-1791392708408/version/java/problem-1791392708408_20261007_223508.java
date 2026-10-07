// Last updated: 10/7/2026, 10:35:08 PM
1
2class Solution {
3    public int singleNumber(int[] nums) {
4        int result = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            result = result ^ nums[i];
8        }
9
10        return result;
11    }
12}
13
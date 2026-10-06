// Last updated: 10/6/2026, 9:32:58 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int i = 0;
4        int j = nums.length - 1;
5
6        while (i <= j) {
7            int mid = i + (j - i) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            if (nums[mid] < target) {
14                i = mid + 1;
15            } else {
16                j = mid - 1;
17            }
18        }
19
20        return -1;
21    }
22}
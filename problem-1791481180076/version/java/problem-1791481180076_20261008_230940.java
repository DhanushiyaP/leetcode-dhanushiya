// Last updated: 10/8/2026, 11:09:40 PM
1
2import java.util.HashSet;
3
4class Solution {
5    public int maximumUniqueSubarray(int[] nums) {
6        HashSet<Integer> set = new HashSet<>();
7        int i = 0;
8        int sum = 0;
9        int max = 0;
10
11        for (int j = 0; j < nums.length; j++) {
12            while (set.contains(nums[j])) {
13                set.remove(nums[i]);
14                sum -= nums[i];
15                i++;
16            }
17
18            set.add(nums[j]);
19            sum += nums[j];
20
21            max = Math.max(max, sum);
22        }
23
24        return max;
25    }
26}
27
// Last updated: 9/25/2026, 9:41:14 AM
1/*<!>*/
2import java.util.*;
3
4class Solution {
5    public int longestConsecutive(int[] nums) {
6        Set<Integer> set = new HashSet<>();
7
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int longest = 0;
13
14        for (int num : set) {
15            if (!set.contains(num - 1)) {
16                int current = num;
17                int count = 1;
18
19                while (set.contains(current + 1)) {
20                    current++;
21                    count++;
22                }
23
24                longest = Math.max(longest, count);
25            }
26        }
27
28        return longest;
29    }
30}
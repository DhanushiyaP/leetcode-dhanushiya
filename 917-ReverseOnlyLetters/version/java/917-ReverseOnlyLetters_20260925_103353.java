// Last updated: 9/25/2026, 10:33:53 AM
1/*!*/
2import java.util.*;
3
4class Solution {
5    public int lengthOfLongestSubstring(String s) {
6        Set<Character> set = new HashSet<>();
7
8        int i = 0;
9        int max = 0;
10
11        for (int j = 0; j < s.length(); j++) {
12
13            while (set.contains(s.charAt(j))) {
14                set.remove(s.charAt(i));
15                i++;
16            }
17
18            set.add(s.charAt(j));
19
20            max = Math.max(max, j - i + 1);
21        }
22
23        return max;
24    }
25}
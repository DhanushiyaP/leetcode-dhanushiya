// Last updated: 10/7/2026, 9:28:40 PM
1
2class Solution {
3    public boolean isIsomorphic(String s, String t) {
4        int[] a = new int[256];
5        int[] b = new int[256];
6
7        for (int i = 0; i < s.length(); i++) {
8            char c1 = s.charAt(i);
9            char c2 = t.charAt(i);
10
11            if (a[c1] != b[c2]) {
12                return false;
13            }
14
15            a[c1] = i + 1;
16            b[c2] = i + 1;
17        }
18
19        return true;
20    }
21}
22
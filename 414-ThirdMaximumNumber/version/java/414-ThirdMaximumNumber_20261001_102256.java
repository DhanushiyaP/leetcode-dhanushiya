// Last updated: 10/1/2026, 10:22:56 AM
1class Solution {
2    public int thirdMax(int[] nums) {
3        Long first = null;
4        Long second = null;
5        Long third = null;
6
7        for (int num : nums) {
8            long n = num;
9
10            if ((first != null && n == first) ||
11                (second != null && n == second) ||
12                (third != null && n == third)) {
13                continue;
14            }
15
16            if (first == null || n > first) {
17                third = second;
18                second = first;
19                first = n;
20            } else if (second == null || n > second) {
21                third = second;
22                second = n;
23            } else if (third == null || n > third) {
24                third = n;
25            }
26        }
27
28        if (third == null) {
29            return first.intValue();
30        }
31
32        return third.intValue();
33    }
34}
// Last updated: 10/8/2026, 11:02:33 PM
1
2class Solution {
3    public boolean judgeSquareSum(int c) {
4        long i = 0;
5        long j = (long) Math.sqrt(c);
6
7        while (i <= j) {
8            long sum = i * i + j * j;
9
10            if (sum == c) {
11                return true;
12            } else if (sum < c) {
13                i++;
14            } else {
15                j--;
16            }
17        }
18
19        return false;
20    }
21}
22
// Last updated: 10/6/2026, 9:45:24 PM
1class Solution {
2    public int nthMagicalNumber(int n, int a, int b) {
3        long left = 1;
4        long right = (long) n * Math.min(a, b);
5        long mod = 1000000007;
6
7        long lcm = (long) a / gcd(a, b) * b;
8
9        while (left < right) {
10            long mid = left + (right - left) / 2;
11
12            long count = mid / a + mid / b - mid / lcm;
13
14            if (count >= n) {
15                right = mid;
16            } else {
17                left = mid + 1;
18            }
19        }
20
21        return (int) (left % mod);
22    }
23
24    public long gcd(long a, long b) {
25        while (b != 0) {
26            long temp = a % b;
27            a = b;
28            b = temp;
29        }
30
31        return a;
32    }
33}
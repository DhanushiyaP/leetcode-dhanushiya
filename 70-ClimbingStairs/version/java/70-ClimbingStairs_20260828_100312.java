// Last updated: 8/28/2026, 10:03:12 AM
1class Solution {
2
3    public int tribonacci(int n) {
4
5        if (n == 0) {
6            return 0;
7        }
8
9        if (n == 1 || n == 2) {
10            return 1;
11        }
12
13        int a = 0;
14        int b = 1;
15        int c = 1;
16
17        for (int i = 3; i <= n; i++) {
18
19            int d = a + b + c;
20
21            a = b;
22            b = c;
23            c = d;
24        }
25
26        return c;
27    }
28}
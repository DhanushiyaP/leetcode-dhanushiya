// Last updated: 10/6/2026, 9:21:03 PM
1class Solution {
2    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
3        int[] d = new int[6];
4
5        d[0] = distance(p1, p2);
6        d[1] = distance(p1, p3);
7        d[2] = distance(p1, p4);
8        d[3] = distance(p2, p3);
9        d[4] = distance(p2, p4);
10        d[5] = distance(p3, p4);
11
12        Arrays.sort(d);
13
14        return d[0] > 0 &&
15               d[0] == d[1] &&
16               d[1] == d[2] &&
17               d[2] == d[3] &&
18               d[4] == d[5] &&
19               d[4] == 2 * d[0];
20    }
21
22    public int distance(int[] p1, int[] p2) {
23        int x = p1[0] - p2[0];
24        int y = p1[1] - p2[1];
25
26        return x * x + y * y;
27    }
28}
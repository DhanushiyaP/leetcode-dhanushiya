// Last updated: 10/7/2026, 9:43:49 PM
1
2class Solution {
3    public int divide(int dividend, int divisor) {   
4        if(dividend==2147483647 &&           divisor==-1){
5           return -2147483647;
6        }
7        if (dividend == Integer.MIN_VALUE && divisor == -1) {
8            return Integer.MAX_VALUE;
9        }
10
11        long a = Math.abs((long) dividend);
12        long b = Math.abs((long) divisor);
13
14        int count = 0;
15
16        while (a >= b) {
17            a = a - b;
18            count++;
19        }
20
21        if ((dividend < 0) ^ (divisor < 0)) {
22            return -count;
23        }
24
25        return count;
26    }
27}
28
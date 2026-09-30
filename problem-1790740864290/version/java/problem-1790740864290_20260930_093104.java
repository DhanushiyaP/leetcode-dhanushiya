// Last updated: 9/30/2026, 9:31:04 AM
1/*!*/
2class Solution {
3    public int myAtoi(String s) {
4        int i = 0;
5        int sign = 1;
6        int num = 0;
7
8        while (i < s.length() && s.charAt(i) == ' ') {
9            i++;
10        }
11
12        if (i < s.length() && s.charAt(i) == '-') {
13            sign = -1;
14            i++;
15        } else if (i < s.length() && s.charAt(i) == '+') {
16            i++;
17        }
18
19        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
20            int digit = s.charAt(i) - '0';
21
22            if (num > (Integer.MAX_VALUE - digit) / 10) {
23                if (sign == 1) {
24                    return Integer.MAX_VALUE;
25                } else {
26                    return Integer.MIN_VALUE;
27                }
28            }
29
30            num = num * 10 + digit;
31            i++;
32        }
33
34        return num * sign;
35    }
36}
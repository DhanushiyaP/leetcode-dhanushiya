// Last updated: 10/8/2026, 11:05:47 PM
1
2class Solution {
3    public String baseNeg2(int n) {
4        if (n == 0) {
5            return "0";
6        }
7
8        StringBuilder sb = new StringBuilder();
9
10        while (n != 0) {
11            int rem = n % -2;
12            n /= -2;
13
14            if (rem < 0) {
15                rem += 2;
16                n++;
17            }
18
19            sb.append(rem);
20        }
21
22        return sb.reverse().toString();
23    }
24}
25
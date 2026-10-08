// Last updated: 10/8/2026, 10:58:48 PM
1
2class Solution {
3    public String toHex(int num) {
4        if (num == 0) {
5            return "0";
6        }
7
8        char[] hex = "0123456789abcdef".toCharArray();
9        StringBuilder sb = new StringBuilder();
10
11        while (num != 0) {
12            int rem = num & 15;
13            sb.append(hex[rem]);
14            num >>>= 4;
15        }
16
17        return sb.reverse().toString();
18    }
19}
20
// Last updated: 9/30/2026, 10:13:07 AM
1/*!*/
2class Solution {
3    public String intToRoman(int num) {
4
5        int[] values = {
6            1000, 900, 500, 400,
7            100, 90, 50, 40,
8            10, 9, 5, 4, 1
9        };
10
11        String[] roman = {
12            "M", "CM", "D", "CD",
13            "C", "XC", "L", "XL",
14            "X", "IX", "V", "IV", "I"
15        };
16
17        StringBuilder result = new StringBuilder();
18
19        for (int i = 0; i < values.length; i++) {
20
21            while (num >= values[i]) {
22                result.append(roman[i]);
23                num = num - values[i];
24            }
25        }
26
27        return result.toString();
28    }
29}
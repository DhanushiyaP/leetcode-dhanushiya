// Last updated: 9/30/2026, 9:18:40 AM
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9
10        for (int i = 0; i < numRows; i++) {
11            rows[i] = new StringBuilder();
12        }
13
14        int row = 0;
15        boolean down = true;
16
17        for (int i = 0; i < s.length(); i++) {
18
19            rows[row].append(s.charAt(i));
20
21            if (row == numRows - 1) {
22                down = false;
23            }
24
25            if (row == 0) {
26                down = true;
27            }
28
29            if (down) {
30                row++;
31            } else {
32                row--;
33            }
34        }
35
36        StringBuilder result = new StringBuilder();
37
38        for (int i = 0; i < numRows; i++) {
39            result.append(rows[i]);
40        }
41
42        return result.toString();
43    }
44}
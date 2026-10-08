// Last updated: 10/8/2026, 10:55:14 PM
1
2import java.util.Stack;
3
4class Solution {
5    public int calculate(String s) {
6        Stack<Integer> stack = new Stack<>();
7        int result = 0;
8        int number = 0;
9        int sign = 1;
10
11        for (int i = 0; i < s.length(); i++) {
12            char c = s.charAt(i);
13
14            if (Character.isDigit(c)) {
15                number = number * 10 + (c - '0');
16            } 
17            else if (c == '+') {
18                result += sign * number;
19                number = 0;
20                sign = 1;
21            } 
22            else if (c == '-') {
23                result += sign * number;
24                number = 0;
25                sign = -1;
26            } 
27            else if (c == '(') {
28                stack.push(result);
29                stack.push(sign);
30                result = 0;
31                sign = 1;
32            } 
33            else if (c == ')') {
34                result += sign * number;
35                number = 0;
36                result *= stack.pop();
37                result += stack.pop();
38            }
39        }
40
41        result += sign * number;
42        return result;
43    }
44}
45
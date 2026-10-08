// Last updated: 10/8/2026, 10:56:49 PM
1
2import java.util.Stack;
3
4class Solution {
5    public int calculate(String s) {
6        Stack<Integer> stack = new Stack<>();
7        int num = 0;
8        char sign = '+';
9
10        for (int i = 0; i < s.length(); i++) {
11            char c = s.charAt(i);
12
13            if (Character.isDigit(c)) {
14                num = num * 10 + (c - '0');
15            }
16
17            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
18                if (sign == '+') {
19                    stack.push(num);
20                } else if (sign == '-') {
21                    stack.push(-num);
22                } else if (sign == '*') {
23                    stack.push(stack.pop() * num);
24                } else if (sign == '/') {
25                    stack.push(stack.pop() / num);
26                }
27
28                sign = c;
29                num = 0;
30            }
31        }
32
33        int result = 0;
34
35        while (!stack.isEmpty()) {
36            result += stack.pop();
37        }
38
39        return result;
40    }
41}
42
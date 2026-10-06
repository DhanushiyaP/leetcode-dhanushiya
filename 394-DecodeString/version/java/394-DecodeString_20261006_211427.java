// Last updated: 10/6/2026, 9:14:27 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> nums = new Stack<>();
4        Stack<String> strs = new Stack<>();
5
6        String current = "";
7        int num = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11
12            if (Character.isDigit(ch)) {
13                num = num * 10 + (ch - '0');
14            } 
15            else if (ch == '[') {
16                nums.push(num);
17                strs.push(current);
18                num = 0;
19                current = "";
20            } 
21            else if (ch == ']') {
22                int k = nums.pop();
23                String previous = strs.pop();
24
25                String temp = "";
26                for (int j = 0; j < k; j++) {
27                    temp += current;
28                }
29
30                current = previous + temp;
31            } 
32            else {
33                current += ch;
34            }
35        }
36
37        return current;
38    }
39}
// Last updated: 10/7/2026, 10:02:29 PM
1
2class Solution {
3    public boolean isPalindrome(String s) {
4        String rev = "";
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8
9            if (Character.isLetterOrDigit(ch)) {
10                rev += Character.toLowerCase(ch);
11            }
12        }
13
14        String original = rev;
15        String reverse = "";
16
17        for (int i = rev.length() - 1; i >= 0; i--) {
18            reverse += rev.charAt(i);
19        }
20
21        return original.equals(reverse);
22    }
23}
24
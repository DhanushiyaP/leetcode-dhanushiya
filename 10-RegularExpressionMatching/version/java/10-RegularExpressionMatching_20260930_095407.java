// Last updated: 9/30/2026, 9:54:07 AM
1/*!*/
2class Solution {
3    public boolean isMatch(String s, String p) {
4        int m = s.length();
5        int n = p.length();
6
7        boolean[][] dp = new boolean[m + 1][n + 1];
8
9        dp[0][0] = true;
10
11        for (int j = 2; j <= n; j++) {
12            if (p.charAt(j - 1) == '*') {
13                dp[0][j] = dp[0][j - 2];
14            }
15        }
16
17        for (int i = 1; i <= m; i++) {
18            for (int j = 1; j <= n; j++) {
19
20                if (p.charAt(j - 1) == '.' ||
21                    p.charAt(j - 1) == s.charAt(i - 1)) {
22
23                    dp[i][j] = dp[i - 1][j - 1];
24
25                } else if (p.charAt(j - 1) == '*') {
26
27                    dp[i][j] = dp[i][j - 2];
28
29                    if (p.charAt(j - 2) == '.' ||
30                        p.charAt(j - 2) == s.charAt(i - 1)) {
31
32                        dp[i][j] = dp[i][j] || dp[i - 1][j];
33                    }
34                }
35            }
36        }
37
38        return dp[m][n];
39    }
40}
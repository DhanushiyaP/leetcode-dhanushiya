// Last updated: 10/6/2026, 9:00:14 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3
4        int count = 0;
5
6        for (int i = 0; i < grid.length; i++) {
7            for (int j = 0; j < grid[0].length; j++) {
8
9                if (grid[i][j] == '1') {
10                    count++;
11                    dfs(grid, i, j);
12                }
13            }
14        }
15
16        return count;
17    }
18
19    public void dfs(char[][] grid, int i, int j) {
20
21        
22        if (i < 0 || i >= grid.length ||
23            j < 0 || j >= grid[0].length) {
24            return;
25        }
26
27        
28        if (grid[i][j] == '0') {
29            return;
30        }
31
32        
33        grid[i][j] = '0';
34
35    
36        dfs(grid, i - 1, j);
37
38    
39        dfs(grid, i + 1, j);
40
41        
42        dfs(grid, i, j - 1);
43
44    
45        dfs(grid, i, j + 1);
46    }
47}
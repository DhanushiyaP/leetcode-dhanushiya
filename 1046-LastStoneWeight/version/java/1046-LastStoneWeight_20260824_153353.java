// Last updated: 8/24/2026, 3:33:53 PM
1/*!*/
2
3class Solution {
4
5    public int islandPerimeter(int[][] grid) {
6
7        int perimeter = 0;
8
9        for (int i = 0; i < grid.length; i++) {
10
11            for (int j = 0; j < grid[0].length; j++) {
12
13                if (grid[i][j] == 1) {
14
15                    // UP
16                    if (i == 0 || grid[i - 1][j] == 0) {
17                        perimeter++;
18                    }
19
20                    // DOWN
21                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
22                        perimeter++;
23                    }
24
25                    // LEFT
26                    if (j == 0 || grid[i][j - 1] == 0) {
27                        perimeter++;
28                    }
29
30                    // RIGHT
31                    if (j == grid[0].length - 1 || grid[i][j + 1] == 0) {
32                        perimeter++;
33                    }
34                }
35            }
36        }
37
38        return perimeter;
39    }
40}
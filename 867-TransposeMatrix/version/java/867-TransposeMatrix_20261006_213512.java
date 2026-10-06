// Last updated: 10/6/2026, 9:35:12 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int[][] result = new int[n][m];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                result[j][i] = matrix[i][j];
11            }
12        }
13
14        return result;
15    }
16}
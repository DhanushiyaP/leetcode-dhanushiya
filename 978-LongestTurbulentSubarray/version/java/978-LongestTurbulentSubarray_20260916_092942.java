// Last updated: 9/16/2026, 9:29:42 AM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3
4        int max = 1;
5        int count = 1;
6
7        for (int i = 1; i < arr.length; i++) {
8
9            if (arr[i] > arr[i - 1]) {
10
11                if (i >= 2 && arr[i - 1] > arr[i - 2]) {
12                    count = 2;
13                } else {
14                    count++;
15                }
16
17            } else if (arr[i] < arr[i - 1]) {
18
19                if (i >= 2 && arr[i - 1] < arr[i - 2]) {
20                    count = 2;
21                } else {
22                    count++;
23                }
24
25            } else {
26                count = 1;
27            }
28
29            max = Math.max(max, count);
30        }
31
32        return max;
33    }
34}
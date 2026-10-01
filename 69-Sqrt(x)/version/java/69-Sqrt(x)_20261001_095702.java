// Last updated: 10/1/2026, 9:57:02 AM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6
7        int left = 1;
8        int right = x;
9        int answer = 0;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13
14            if (mid <= x / mid) {
15                answer = mid;
16                left = mid + 1;
17            } else {
18                right = mid - 1;
19            }
20        }
21
22        return answer;
23    }
24}
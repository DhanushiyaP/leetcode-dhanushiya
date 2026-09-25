// Last updated: 9/25/2026, 10:28:03 AM
1/*!*/
2import java.util.*;
3
4class Solution {
5    public int[][] merge(int[][] intervals) {
6        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
7
8        List<int[]> result = new ArrayList<>();
9
10        int start = intervals[0][0];
11        int end = intervals[0][1];
12
13        for (int i = 1; i < intervals.length; i++) {
14            if (intervals[i][0] <= end) {
15                end = Math.max(end, intervals[i][1]);
16            } else {
17                result.add(new int[]{start, end});
18
19                start = intervals[i][0];
20                end = intervals[i][1];
21            }
22        }
23
24        result.add(new int[]{start, end});
25
26        return result.toArray(new int[result.size()][]);
27    }
28}
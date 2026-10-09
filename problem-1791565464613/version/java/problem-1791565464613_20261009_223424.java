// Last updated: 10/9/2026, 10:34:24 PM
1import java.util.*;
2
3class Solution {
4    public String largestNumber(int[] nums) {
5        String[] arr = new String[nums.length];
6
7        for (int i = 0; i < nums.length; i++) {
8            arr[i] = String.valueOf(nums[i]);
9        }
10
11        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
12
13        if (arr[0].equals("0")) {
14            return "0";
15        }
16
17        StringBuilder sb = new StringBuilder();
18
19        for (String s : arr) {
20            sb.append(s);
21        }
22
23        return sb.toString();
24    }
25}
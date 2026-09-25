// Last updated: 9/25/2026, 10:24:10 AM
1/*!*/
2class Solution {
3    public int maxProduct(int[] nums) {
4        int max = nums[0];
5        int min = nums[0];
6        int answer = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9            int num = nums[i];
10
11            if (num < 0) {
12                int temp = max;
13                max = min;
14                min = temp;
15            }
16
17            max = Math.max(num, max * num);
18            min = Math.min(num, min * num);
19
20            answer = Math.max(answer, max);
21        }
22
23        return answer;
24    }
25}
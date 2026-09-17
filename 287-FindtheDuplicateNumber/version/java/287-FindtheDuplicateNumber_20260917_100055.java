// Last updated: 9/17/2026, 10:00:55 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5
6            if(seen.contains(nums[i])){
7                return nums[i];
8            }
9            seen.add(nums[i]);
10        }
11        return -1;
12    }
13}
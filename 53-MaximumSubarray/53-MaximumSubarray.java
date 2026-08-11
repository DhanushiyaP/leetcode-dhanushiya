// Last updated: 8/11/2026, 4:01:51 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i],curr+nums[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
}


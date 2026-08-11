// Last updated: 8/11/2026, 4:00:22 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ex = n*(n+1)/2;
        int ac = 0;
        for(int i=0;i<n;i++){
            ac+=nums[i];
        }
        return ex-ac;
    }
}
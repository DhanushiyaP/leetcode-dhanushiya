// Last updated: 8/11/2026, 3:59:19 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ts = 0;
        for(int i=0;i<n;i++){
            ts+=nums[i];
        }
        int ls=0;
        for(int i=0;i<n;i++){
            int rs = ts-ls-nums[i];
            if(rs==ls){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}
// Last updated: 8/11/2026, 4:00:19 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(pos<nums.length){
            nums[pos]=0;
            pos++;
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}
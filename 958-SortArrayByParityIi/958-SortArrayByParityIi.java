// Last updated: 8/11/2026, 3:59:02 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int odd=1;
        int eve =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[eve]=nums[i];
                eve+=2;
            }
            else{
                arr[odd]=nums[i];
                odd+=2;
            }
        }
        return arr;
    }
}
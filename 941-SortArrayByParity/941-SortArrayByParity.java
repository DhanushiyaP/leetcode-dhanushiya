// Last updated: 8/11/2026, 3:59:06 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int arr[]=new int[n];
        int pos=0;
        int rig=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[pos]=nums[i];
                pos++;
            }
            else{
                arr[rig]=nums[i];
                rig--;
            }
        }
        return arr;
    }
}
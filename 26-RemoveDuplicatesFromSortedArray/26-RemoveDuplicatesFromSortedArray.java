// Last updated: 8/11/2026, 4:02:02 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int arr[] = new int[nums.length];
        Set<Integer> seen = new HashSet<>();
        int d=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(seen.add(nums[i])){
                nums[d++]=nums[i];
                c++;
            }
        }
        return d;
       
    }
}
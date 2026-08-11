// Last updated: 8/11/2026, 4:00:35 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for(int num : nums){
        if(!seen.add(num)){
            return true;
        }
    }
     return false;
    }
}
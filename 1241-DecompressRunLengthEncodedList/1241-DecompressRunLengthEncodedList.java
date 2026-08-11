// Last updated: 8/11/2026, 3:58:58 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
       for(int i=0;i<nums.length;i+=2){
             int freq = nums[i];
             int val = nums[i+1];

          for(int j=0;j<freq;j++){
               res.add(val);
          }
       }
       int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
             arr[i]=res.get(i);
        }
        return arr;
    }
}
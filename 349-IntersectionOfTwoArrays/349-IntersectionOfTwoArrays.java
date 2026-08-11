// Last updated: 8/11/2026, 4:00:06 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        int arr[] =new int[result.size()];
        int i=0;
        for(int num:result){
            arr[i++]=num;
        }
        return arr;


    }
}
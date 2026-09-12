// Last updated: 9/12/2026, 8:53:51 PM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer,List<Integer>> positions = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            positions.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
6        }
7        int count =0;
8        for(List<Integer> idx : positions.values()){
9            if(idx.size()==3 && (idx.get(1)-idx.get(0)==idx.get(2)-idx.get(1))){
10                count++;
11            }
12        }
13        return count;
14    }
15}
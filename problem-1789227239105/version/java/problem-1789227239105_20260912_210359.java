// Last updated: 9/12/2026, 9:03:59 PM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer, List<Integer>> pos = new HashMap<>();
4        for(int i=0;i<nums.length;i++)
5           pos.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
6        int count=0;
7        for(List<Integer> idx:pos.values()){
8            if(idx.size() <3)continue;
9                int diff = idx.get(1)-idx.get(0);
10                boolean ok = true;
11                for(int i=2;i<idx.size();i++)
12                    if(idx.get(i)-idx.get(i-1)!=diff){
13                        ok=false;
14                        break;
15                    }
16            if(ok) count++;
17        }
18        return count;
19    }
20}
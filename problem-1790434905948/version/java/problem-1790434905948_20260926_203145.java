// Last updated: 9/26/2026, 8:31:45 PM
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3        int n = nums.length, ans=0;
4        for(int left=0;left<n;left++){
5            long sum=0;
6            Map<Long,Boolean> seen = new HashMap<>();
7            for(int right = left;right<n;right++){
8                sum+=nums[right];
9                long val = ((2L*nums[right])%k+k)%k;
10                seen.put(val,true);
11                long need=((sum % k)+k)%k;
12                if(need == 0 || seen.containsKey(need)){
13                    ans=Math.max(ans,right-left+1);
14                }
15            }
16        }
17        return ans;
18    }
19}
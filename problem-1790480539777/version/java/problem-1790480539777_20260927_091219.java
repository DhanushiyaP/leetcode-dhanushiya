// Last updated: 9/27/2026, 9:12:19 AM
1class Solution {
2    public int maxSubarray(int[] nums) {
3        int n=nums.length;
4        TreeMap<Integer, Integer> freq = new TreeMap<>();
5        int left=0, ans=0;
6        for(int right=0;right<n;right++){
7            int x=nums[right];
8            while(violates(freq,x)){
9                int lv = nums[left++];
10                freq.merge(lv,-1,Integer::sum);
11                if(freq.get(lv)==0) freq.remove(lv);
12            }
13            freq.merge(x,1,Integer::sum);
14            ans=Math.max(ans,right-left+1);
15        }
16        return ans;
17    }   
18        private boolean violates(TreeMap<Integer, Integer> freq, int x){
19            for(int a :freq.keySet()){
20                if(a>x) break;
21                int b =x-a;
22                if(b<a) break;
23                if(freq.containsKey(b)&& (a!=b || freq.get(a)>=2)) return true;
24            }
25            for(int b : freq.keySet()){
26                if(freq.containsKey(x+b)) return true;
27            }
28            return false;
29        }
30    }
31
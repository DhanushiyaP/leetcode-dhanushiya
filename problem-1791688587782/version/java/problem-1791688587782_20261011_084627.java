// Last updated: 10/11/2026, 8:46:27 AM
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        List<Integer> res = new ArrayList<>();
4        int sum=0;
5        for(int i=2;i<=n;i++){
6            boolean p = true;
7            for(int j=2;j*j<=i;j++) if(i%j==0){ p = false; break; }
8            if(!p) continue;
9            if(sum+i>s) break;
10            sum+=i;
11            res.add(i);
12        }
13        return res;
14    }
15}
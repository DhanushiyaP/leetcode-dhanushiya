// Last updated: 9/27/2026, 9:30:01 AM
1class Solution {
2    long[] f;int n;
3    public long maxEarnings(int[][] m) {
4        n=m.length;
5        int[] s = new int[n], e=new int[n];
6        long[] v = new long[n];
7        Integer[] o = new Integer[n];
8        for(int i=0;i<n;i++){
9            s[i]=m[i][0]; e[i]=m[i][1];
10            v[i]=m[i][2]-(long)(e[i]-s[i]);
11            o[i]=i;
12        }
13        Arrays.sort(o, (a,b) -> e[a]-e[b]);
14        int[] se = new int[n];
15        for(int i=0;i<n;i++) se[i]=e[o[i]];
16        long NEG = Long.MIN_VALUE/2;
17        f=new long[n+1];
18        Arrays.fill(f,NEG);
19        long[] dp = new long[n];
20        long ans = NEG;
21
22        for(int k=0;k<n;k++){
23            int i =o[k];
24            int p = ub(se, s[i],k);
25            long best =p>0?q(p):NEG;
26            dp[i]=v[i]+Math.max(-s[i],best);
27            ans=Math.max(ans,dp[i]+e[i]);
28            up(k+1, dp[i]);
29        }
30        return ans;
31    }
32    int  ub(int[] a,int t,int hi){
33        int  lo=0;
34        while(lo < hi){
35            int mid = (lo + hi)>>>1;
36            if(a[mid]<=t) lo= mid+1;else hi= mid;
37        }
38        return lo;
39    }
40    void up(int i, long val){
41        for(;i<=n;i+=i & (-i)) f[i]=Math.max(f[i],val);
42    }
43    long q(int i){
44        long r = Long.MIN_VALUE/2;
45        for(;i>0;i-=i & (-i)) r=Math.max(r, f[i]);
46        return r;
47    }
48
49
50
51
52
53    
54}
55
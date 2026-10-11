// Last updated: 10/11/2026, 9:25:51 AM
1class Solution {
2    public List<Integer> maxPrimeSubset(int n, int s) {
3        List<Integer> p = new ArrayList<>();
4        int total=0;
5        for(int i=2;i<=n;i++){
6            boolean ok = true;
7            for(int j=2;j*j<=i;j++) if(i%j==0){
8              ok = false; break;
9            }
10            if(ok){ p.add(i); total+=i;}
11        }
12    int m = p.size();
13    s= Math.min(s,total);
14    List<Integer>  res = new ArrayList<>();
15    if(m==0 ||s<2) return res;
16    final short INF = 10000;
17    short[][] f = new short[m+1][s+1];
18    for(short[] row : f)Arrays.fill(row, INF);
19    f[m][0]=0;
20    for(int i=m-1;i>=0;i--){
21        int v = p.get(i);
22        for(int t =0;t<=s;t++){
23            f[i][t] = f[i+1][t];
24            if(t>=v && f[i+1][t-v]+1<f[i][t]) f[i][t]=(short)(f[i+1][t-v]+1);
25        }
26    }
27    int t =s;
28    while(t>0 && f[0][t]>= INF) t--;
29    if(t==0) return res;
30    int c = f[0][t], i=0;
31    while(c>0){
32        for(int j=i;j<m;j++){
33            int v = p.get(j);
34            if(t>=v && f[j+1][t-v]==c-1){
35                res.add(v);
36                t-=v;
37                c--;
38                i=j+1;
39                break;
40            }
41        }
42    }
43    return res;
44}
45
46}
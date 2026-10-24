// Last updated: 10/24/2026, 9:02:44 PM
1class Solution {
2    public int countMagicalPairs(String s) {
3        int n =s.length();
4        int ans = 0;
5        for(int j=0;j<n-1;j++){
6            long[] L = new long[27], R = new long[27];
7            int m =0;
8            for(int i=j;i>=0;i--){
9                m |= 1 << (s.charAt(i)-'a');
10                L[Integer.bitCount(m)]++;
11            }
12            m=0;
13            for(int k=j+1;k<n;k++){
14                m |=1 << (s.charAt(k)-'a');
15                R[Integer.bitCount(m)]++;
16            }
17            for(int c=1;c<=26;c++) ans +=L[c] * R[c];
18        }
19        return ans;
20    }
21}
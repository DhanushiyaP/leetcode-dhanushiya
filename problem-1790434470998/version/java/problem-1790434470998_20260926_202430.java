// Last updated: 9/26/2026, 8:24:30 PM
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sumS=0, sumT=0;
4        for(int x:source) sumS +=x;
5        for(int x:target) sumT +=x;
6        if(source.length<2){
7            return source[0]==target[0];
8        }
9        return sumS == sumT;
10        
11        
12    }
13}
// Last updated: 10/1/2026, 10:20:01 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0){
4            return false;
5        }
6        while(n%2==0){
7            n/=2;
8        }
9        return n==1;
10    }
11}
// Last updated: 8/31/2026, 9:06:36 AM
1class Solution {
2    public int fib(int n) {
3        if(n==0||n==1){
4            return n;
5        }
6        return fib(n-1)+fib(n-2);
7    }
8}
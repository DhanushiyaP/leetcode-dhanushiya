// Last updated: 10/10/2026, 9:10:37 AM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int s=0;
4        for(int i=1;i<=num/2;i++){
5            if(num%i==0){
6                s+=i;
7            }
8        }
9        return num==s;
10    }
11}
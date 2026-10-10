// Last updated: 10/10/2026, 8:26:36 PM
1class Solution {
2    public int resilientSubarray(int[] nums, int k) {
3        int n = nums.length, ans=1;
4        for(int i=0;i<n;){
5            int r = ((nums[i]%k)+k)%k,j=i;
6            while(j<n && ((nums[j]%k)+k)%k==r)j++;
7            int d= k/gcd(r,k);
8            ans=Math.max(ans,(j-i-1)/d*d+1);
9            i=j;
10        }
11        return ans;
12    }
13    private int gcd(int a,int b){
14        return b == 0 ? a : gcd(b,a%b);
15    }
16}
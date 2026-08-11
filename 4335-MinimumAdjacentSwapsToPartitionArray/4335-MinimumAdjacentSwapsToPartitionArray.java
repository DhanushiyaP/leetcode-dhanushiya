// Last updated: 8/11/2026, 3:58:17 PM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        Object fm;
        long cnt1=0;
        long cnt2 =0;
        long ans = 0;
        fm = new Object[]{nums,a,b
        };
        for(int i=0;i<n;i++){
            int x = nums[i];
            if(x<a){
                ans = (ans+cnt1+cnt2)%MOD;
            }
            else if(x<=b){
                ans = (ans+cnt2) % MOD;
                cnt1++;
                cnt1%=MOD;
            }
            else{
                cnt2++;
                cnt2 %=MOD;
            }
        }
        if(fm==null) return 0;
        return (int)(ans%MOD);
    }
}
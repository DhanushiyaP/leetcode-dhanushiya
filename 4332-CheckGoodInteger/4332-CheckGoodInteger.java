// Last updated: 8/11/2026, 3:58:19 PM
class Solution {
    public boolean checkGoodInteger(int nu) {
        int rem=0;
        int n = nu;
        while(n>0){
            rem +=n%10;
            n /=10;
        }
        int t = nu;
        int rm=0;
        while(t>0){
            int sr =t%10;
            rm += sr*sr;
            t/=10;
        }
        int q=rem-rm;
        
            return (rm-rem >=50);
    }
}
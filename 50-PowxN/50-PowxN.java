// Last updated: 8/11/2026, 4:01:54 PM
class Solution {
    public double myPow(double x, int n) {
        double res = Math.pow(x,n);
        String s = String.format("%.5f",res);
        return Double.parseDouble(s);
    }
}
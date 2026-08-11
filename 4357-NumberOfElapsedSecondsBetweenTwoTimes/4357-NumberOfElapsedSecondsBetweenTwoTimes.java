// Last updated: 8/11/2026, 3:57:51 PM
class Solution {
    public int secondsBetweenTimes(String sT, String eT) {
        int sh = Integer.parseInt(sT.substring(0,2));
          int sm = Integer.parseInt(sT.substring(3,5));
          int ss = Integer.parseInt(sT.substring(6,8));
          int eh = Integer.parseInt(eT.substring(0,2));
        int em = Integer.parseInt(eT.substring(3,5));
        int es = Integer.parseInt(eT.substring(6,8));
        int s = sh * 3600 + sm*60+ss;
         int e = eh * 3600 + em*60+es;
        return e-s;
    }
}
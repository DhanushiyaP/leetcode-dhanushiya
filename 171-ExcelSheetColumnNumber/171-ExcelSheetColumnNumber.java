// Last updated: 8/11/2026, 4:01:10 PM
class Solution {
    public int titleToNumber(String cT) {
        int res = 0;
        for(int i=0;i<cT.length();i++){
            char c = cT.charAt(i);
            int val = c-'A'+1;
            res = res*26 + val;
        }
        return res;
    }
}
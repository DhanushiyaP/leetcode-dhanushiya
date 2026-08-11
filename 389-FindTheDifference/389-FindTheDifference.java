// Last updated: 8/11/2026, 3:59:58 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char c : s.toCharArray()){
            ans^=c;
        }
        for(char c : t.toCharArray()){
            ans^=c;
        }
        return ans;
    }
}
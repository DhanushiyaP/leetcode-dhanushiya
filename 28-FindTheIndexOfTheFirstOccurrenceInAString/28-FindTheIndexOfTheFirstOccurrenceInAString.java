// Last updated: 8/11/2026, 4:01:59 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m==0) return -1;
        for(int i=0;i<=n-m;i++){
            if(needle.equals(haystack.substring(i,i+m))){
                return i;
            }
        }
        return -1;
    }
}
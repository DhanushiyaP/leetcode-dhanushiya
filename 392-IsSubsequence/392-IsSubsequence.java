// Last updated: 8/11/2026, 3:59:53 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(s.length()==i++){
            return true;
        }
        else{
            return false;
        }
    }
}
// Last updated: 8/11/2026, 4:01:18 PM
class Solution {
    public String convertToTitle(int cN) {
        StringBuilder res = new StringBuilder();
        while(cN>0){
            cN--;
            char c = (char)('A'+(cN%26));
            res.append(c);
            cN/=26;
        }
        return res.reverse().toString();
        
    }
}
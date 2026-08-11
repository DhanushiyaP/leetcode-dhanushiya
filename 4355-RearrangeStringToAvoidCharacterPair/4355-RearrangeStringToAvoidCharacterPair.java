// Last updated: 8/11/2026, 3:57:53 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder other = new StringBuilder();
        int cx=0;
        int cy=0;
        for(char ch : s.toCharArray()){
            if(ch==x){
                cx++;
            }
            else if(ch==y){
                cy++;
            }
            else{
                other.append(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(cy-->0){
            ans.append(y);
        }
        ans.append(other);
        while(cx-->0){
            ans.append(x);
        }
        return ans.toString();
    }
}
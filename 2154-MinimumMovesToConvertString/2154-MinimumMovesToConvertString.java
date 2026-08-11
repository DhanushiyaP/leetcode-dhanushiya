// Last updated: 8/11/2026, 3:58:41 PM
class Solution {
    public int minimumMoves(String s) {
        int count=0;
        int i=0;
        while(i<=s.length()-1){
            if(s.charAt(i)=='X'){
                count++;
                i+=3;
            }
            else{
                i+=1;
            }
        }
        return count;

    }
}
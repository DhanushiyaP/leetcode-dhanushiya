// Last updated: 8/11/2026, 3:59:28 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
             char ch = moves.charAt(i);
              if(ch=='R'){
                 x--;
              }
              else if(ch=='L'){
                x++;
              }
              else if(ch=='U'){
                y++;
              }
              else if(ch=='D'){
                y--;
              }
        }
        return x==0 && y==0;
    }
}
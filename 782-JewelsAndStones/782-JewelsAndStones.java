// Last updated: 8/11/2026, 3:59:14 PM
class Solution {
    public int numJewelsInStones(String j, String s) {
        int c =0;
      for(int i=0;i<j.length();i++){
          char je = j.charAt(i);
          for(int k=0;k<s.length();k++){
              int se = s.charAt(k);
              if(je==se){
                c++;
              }
          }
     }
     return c;  
    }
}
// Last updated: 8/11/2026, 3:59:36 PM
class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<words.length;i++){
            res.append(new StringBuilder(words[i]).reverse());
               if(i<words.length-1){
                 res.append(" ");
               }
        }
        return res.toString();
    }
}
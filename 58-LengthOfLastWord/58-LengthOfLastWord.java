// Last updated: 8/11/2026, 4:01:48 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.trim().split("\\s+");
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                int j=0;
                 while(j<arr[i].length()){
                       c++;
                       j++;
                 }
            }
        }
        return c;
    }
}
// Last updated: 8/11/2026, 3:59:45 PM
class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty())
           return 0;
        String arr[] = s.trim().split("\\s+");
        int c =0;
        for(int i=0;i<arr.length;i++){
            c++;
        }
        return c;
    }
}
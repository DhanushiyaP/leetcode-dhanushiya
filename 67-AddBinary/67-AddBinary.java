// Last updated: 8/11/2026, 4:01:43 PM
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
       int i = a.length()-1;
       int j = b.length()-1;
       int c=0;
       while(i>=0||j>=0||c>0){
        int d1 = (i>=0)?(a.charAt(i)-'0'):0;
        int d2 = (j>=0)?(b.charAt(j)-'0'):0;
        int sum = d1+d2+c;
        result.append(sum%2);
        c=sum/2;
        i--;
        j--;
       }
       return result.reverse().toString();



    }
}
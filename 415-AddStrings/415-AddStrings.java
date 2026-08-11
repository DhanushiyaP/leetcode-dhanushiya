// Last updated: 8/11/2026, 3:59:46 PM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int c=0;
        while(j>=0||i>=0||c>0){
            int d1 = (i>=0)?num1.charAt(i)-'0':0;
            int d2 = (j>=0)?num2.charAt(j)-'0':0;
            int sum = d1+d2+c;
            sb.append(sum%10);
            c = sum/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
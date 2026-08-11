// Last updated: 8/11/2026, 4:02:11 PM
class Solution {
    public boolean isPalindrome(int x) {
       if(x<0 || x%10==0 && x!=0){
            return false;
       }
       int temp = x;
       int b = 0;
       while(temp>0){
        int d = temp%10;
          b=b*10 + d;
          temp/=10;
       }
       if(x==b){
        return true;
       }
       else{
        return false;
       }

    }
}
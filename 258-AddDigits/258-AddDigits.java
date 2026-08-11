// Last updated: 8/11/2026, 4:00:31 PM
class Solution {
    public int addDigits(int num) {
     while(num>=10){
         int sum =0;
        while(num>0){
            int remi = num%10;
            sum+=remi;
            num/=10;
        }
        num=sum;
     }  
     return num; 
    }
}
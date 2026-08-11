// Last updated: 8/11/2026, 3:57:56 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g =gcd(nums[i],nums[j]);
                long pro = 1L * nums[i]*nums[j];
                long st = pro/(g*g);
                max=Math.max(max,st);
            }
        }
           return max;
    }
       private int gcd(int a,int b){
           while(b!=0){
               int t = b;
               b=a%b;
               a=t;
           }
           return a;
       }
}
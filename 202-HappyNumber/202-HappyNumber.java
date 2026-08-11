// Last updated: 8/11/2026, 4:00:41 PM
class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int s = 0;
            while(n>0){
                int temp = n%10;
                s+= temp*temp;
                n/=10;
            }
            n=s;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}
// Last updated: 8/11/2026, 3:59:42 PM
class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int numr[] = new int[num1.length];
        for(int i=0;i<num1.length;i++){
            numr[i]=-1;
        for (int k = 0; k < num2.length; k++) {
               if(num1[i]==num2[k]){
                 for(int j=k+1;j<num2.length;j++){
                  if(num2[j]>num1[i]){
                    numr[i]=num2[j];
                    break;
                  }
          }
                 break;
          }
        }
        }
            return numr;
    }
}

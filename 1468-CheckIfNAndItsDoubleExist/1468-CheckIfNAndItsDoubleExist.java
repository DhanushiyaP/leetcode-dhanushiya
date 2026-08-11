// Last updated: 8/11/2026, 3:58:43 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }
}
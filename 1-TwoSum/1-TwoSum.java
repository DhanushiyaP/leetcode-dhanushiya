// Last updated: 8/11/2026, 4:02:22 PM
class Solution {
    public int[] twoSum(int[] arr, int target) {
        boolean same = false;
        int[] brr = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(arr[i]+arr[j]==target){
                    brr[0]=i;
                    brr[1]=j;
                    same = true;
                    break;
                 }
                 else{
                    same=false;
                 }
            }
        }
        //if(same){
                return brr;
        //}
       // else{
            //return ;
       // }
    }
}

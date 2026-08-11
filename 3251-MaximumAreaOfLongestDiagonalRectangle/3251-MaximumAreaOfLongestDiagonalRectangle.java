// Last updated: 8/11/2026, 3:58:33 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
       int maxarea=0;
       double maxdig =0;
       int n =  dim.length;
       for(int i=0;i<n;i++){
         int w = dim[i][0];
         int l = dim[i][1];       
        double d = Math.sqrt(w*w + l*l);
        int area = w*l;
            if(d>maxdig || d==maxdig && area>maxarea){
                maxdig = d;
                maxarea = area;
            }
        }
       return maxarea;
    }
}
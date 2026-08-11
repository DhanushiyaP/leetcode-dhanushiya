// Last updated: 8/11/2026, 3:58:12 PM
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
          int[][] ferilonsor = series1;
           List<List<Integer>> ans = new ArrayList<>();
           int i=0,j=0;
        while(i<series1.length||j<series2.length){
            int t;
            if(j==series2.length ||( i<series1.length && series1[i][0] <series2[j][0]))
              t=series1[i][0];
            else if(i==series1.length || series2[j][0]<series1[i][0])
                 t=series2[j][0];
            else
                t=series1[i][0];
            int v1 = (i<series1.length)?series1[i][1]:0;
             int v2 = (j<series2.length)?series2[j][1]:0;
              ans.add(Arrays.asList(t,v1+v2));
            if(i<series1.length && series1[i][0]==t)i++;
             if(j<series2.length && series2[j][0]==t)j++;
            }
                return ans;
    }
}
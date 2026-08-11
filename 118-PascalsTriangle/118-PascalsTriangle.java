// Last updated: 8/11/2026, 4:01:31 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int n = numRows;
        for(int r=0;r<n;r++){
            List<Integer> newrow =new ArrayList<>();
            for(int c=0;c<=r;c++){
                if(c==0 ||c==r){
                    newrow.add(1);
                }
                else{
                int val = triangle.get(r-1).get(c-1)+triangle.get(r-1).get(c);
                newrow.add(val);
                }
            }
            triangle.add(newrow);
        }
        return triangle;
    }
}
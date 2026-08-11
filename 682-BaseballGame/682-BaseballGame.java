// Last updated: 8/11/2026, 3:59:23 PM
class Solution {
    public int calPoints(String[] ops) {
        List<Integer> records= new ArrayList<>();
       
        for(int i=0;i<ops.length;i++){
              String op = ops[i];
              if(op.equals("C")){
                records.remove(records.size()-1);
              }
              else if(op.equals("D")){
                int ch = records.get(records.size() - 1);
                records.add(ch*2);
              }
              else if(op.equals("+")){
                int fir = records.get(records.size()-2);
                int sec = records.get(records.size()-1);
                records.add(fir + sec);
              }
              else{
                records.add(Integer.parseInt(op));
              }
        }
        int ts=0;
        for(int i=0;i<records.size();i++){
            ts+=records.get(i);
        }
        return ts;
    }
}
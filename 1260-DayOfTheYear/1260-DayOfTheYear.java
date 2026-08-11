// Last updated: 8/11/2026, 3:58:55 PM
class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year=Integer.parseInt( parts[0]);
        int month=Integer.parseInt( parts[1]);
        int day=Integer.parseInt( parts[2]);
       int daytot[]={31,28,31,30,31,30,31,31,30,31,30,31};
       if(year%4==0 && year%100!=0 || year%400==0){
          daytot[1]=29;
       }
       int totday=0;
       for(int i=0;i<month-1;i++){
        totday+=daytot[i];
       }
       totday+=day;
       return totday;
    }
}
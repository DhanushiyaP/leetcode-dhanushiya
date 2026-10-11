// Last updated: 10/11/2026, 8:53:55 AM
1class BusBooking {
2         private Map<String, Integer> booked = new HashMap<>();
3        private int total=0;
4        public BusBooking(int n) {
5        
6    }
7    
8    public void toggle(String seat) {
9        if(booked.containsKey(seat)){
10            total -= booked.remove(seat);
11            return;
12        }
13        char c = seat.charAt(0);
14        String row = seat.substring(1);
15        int cost=1;
16        if(c=='A' && booked.containsKey("B"+row)) cost=3;
17        else if(c=='D' && booked.containsKey("C"+ row)) cost=3;
18        booked.put(seat, cost);
19        total+=cost;
20    }
21    
22    public int getTotalTime() {
23        return total;
24    }
25    
26    public int getMinTime() {
27        return booked.size();
28    }
29}
30
31/**
32 * Your BusBooking object will be instantiated and called as such:
33 * BusBooking obj = new BusBooking(n);
34 * obj.toggle(seat);
35 * int param_2 = obj.getTotalTime();
36 * int param_3 = obj.getMinTime();
37 */
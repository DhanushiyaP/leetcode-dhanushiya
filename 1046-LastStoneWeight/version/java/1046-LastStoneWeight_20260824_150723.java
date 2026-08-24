// Last updated: 8/24/2026, 3:07:23 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int stone : stones){
5            pq.add(stone);
6        }
7        while(pq.size()>1){
8            int y=pq.poll();
9            int x=pq.poll();
10            if(x!=y){
11                pq.add(y-x);
12            }
13        }
14        if(pq.isEmpty()){
15            return 0;
16        }
17        return pq.poll();
18    }
19}
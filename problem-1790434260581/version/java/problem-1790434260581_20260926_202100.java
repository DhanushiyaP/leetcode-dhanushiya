// Last updated: 9/26/2026, 8:21:00 PM
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3        int dr = target[0]-source[0], dc=target[1]-source[1];
4        if(dr==0 && dc==0) return 0;
5        if(dr==0 || dc==0|| Math.abs(dr)==Math.abs(dc)) return 1;
6        return 2;
7    }
8}
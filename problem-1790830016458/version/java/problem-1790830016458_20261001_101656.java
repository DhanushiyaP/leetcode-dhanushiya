// Last updated: 10/1/2026, 10:16:56 AM
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] prime = new boolean[n];
4
5        for (int i = 2; i < n; i++) {
6            prime[i] = true;
7        }
8
9        for (int i = 2; i * i < n; i++) {
10            if (prime[i]) {
11                for (int j = i * i; j < n; j += i) {
12                    prime[j] = false;
13                }
14            }
15        }
16
17        int count = 0;
18
19        for (int i = 2; i < n; i++) {
20            if (prime[i]) {
21                count++;
22            }
23        }
24
25        return count;
26    }
27}
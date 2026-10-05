// Last updated: 10/5/2026, 9:15:57 AM
1/*!*/
2class Solution {
3    public List<List<Integer>> combine(int n, int k) {
4        List<List<Integer>> result = new ArrayList<>();
5        List<Integer> current = new ArrayList<>();
6
7        backtrack(1, n, k, current, result);
8
9        return result;
10    }
11
12    public void backtrack(int start, int n, int k,
13                          List<Integer> current,
14                          List<List<Integer>> result) {
15
16        if (current.size() == k) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        for (int i = start; i <= n; i++) {
22
23            current.add(i);
24
25            backtrack(i + 1, n, k, current, result);
26
27            current.remove(current.size() - 1);
28        }
29    }
30}
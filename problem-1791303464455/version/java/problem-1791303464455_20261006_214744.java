// Last updated: 10/6/2026, 9:47:44 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        find(candidates, target, 0, new ArrayList<>(), ans);
6
7        return ans;
8    }
9
10    public void find(int[] candidates, int target, int i,
11                     List<Integer> list, List<List<Integer>> ans) {
12
13        if (target == 0) {
14            ans.add(new ArrayList<>(list));
15            return;
16        }
17
18        if (target < 0 || i == candidates.length) {
19            return;
20        }
21
22        list.add(candidates[i]);
23
24        find(candidates, target - candidates[i], i, list, ans);
25
26        list.remove(list.size() - 1);
27
28        find(candidates, target, i + 1, list, ans);
29    }
30}
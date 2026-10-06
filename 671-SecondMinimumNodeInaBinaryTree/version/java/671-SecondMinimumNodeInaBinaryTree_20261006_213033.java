// Last updated: 10/6/2026, 9:30:33 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int findSecondMinimumValue(TreeNode root) {
18        long ans = find(root, root.val);
19
20        if (ans == Long.MAX_VALUE) {
21            return -1;
22        }
23
24        return (int) ans;
25    }
26
27    public long find(TreeNode root, int min) {
28        if (root == null) {
29            return Long.MAX_VALUE;
30        }
31
32        if (root.val > min) {
33            return root.val;
34        }
35
36        long left = find(root.left, min);
37        long right = find(root.right, min);
38
39        return Math.min(left, right);
40    }
41}
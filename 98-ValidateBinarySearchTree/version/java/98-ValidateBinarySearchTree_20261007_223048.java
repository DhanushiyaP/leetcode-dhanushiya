// Last updated: 10/7/2026, 10:30:48 PM
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
16
17class Solution {
18    public boolean isValidBST(TreeNode root) {
19        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
20    }
21
22    public boolean check(TreeNode root, long min, long max) {
23        if (root == null) {
24            return true;
25        }
26
27        if (root.val <= min || root.val >= max) {
28            return false;
29        }
30
31        return check(root.left, min, root.val)
32            && check(root.right, root.val, max);
33    }
34}
35
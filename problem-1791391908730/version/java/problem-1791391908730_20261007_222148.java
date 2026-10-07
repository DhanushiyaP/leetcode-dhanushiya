// Last updated: 10/7/2026, 10:21:48 PM
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
18    public TreeNode deleteNode(TreeNode root, int key) {
19        if (root == null) {
20            return null;
21        }
22
23        if (key < root.val) {
24            root.left = deleteNode(root.left, key);
25        } 
26        else if (key > root.val) {
27            root.right = deleteNode(root.right, key);
28        } 
29        else {
30            if (root.left == null) {
31                return root.right;
32            }
33
34            if (root.right == null) {
35                return root.left;
36            }
37
38            TreeNode temp = root.right;
39
40            while (temp.left != null) {
41                temp = temp.left;
42            }
43
44            root.val = temp.val;
45            root.right = deleteNode(root.right, temp.val);
46        }
47
48        return root;
49    }
50}
51
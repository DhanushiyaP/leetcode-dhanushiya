// Last updated: 10/8/2026, 10:55:38 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11
12class Solution {
13    public ListNode reverseList(ListNode head) {
14        ListNode prev = null;
15        ListNode curr = head;
16
17        while (curr != null) {
18            ListNode next = curr.next;
19            curr.next = prev;
20            prev = curr;
21            curr = next;
22        }
23
24        return prev;
25    }
26}
27
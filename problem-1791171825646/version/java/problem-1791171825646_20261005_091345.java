// Last updated: 10/5/2026, 9:13:45 AM
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
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13
14        if (head == null || head.next == null || k == 0) {
15            return head;
16        }
17
18        int n = 1;
19        ListNode tail = head;
20
21        while (tail.next != null) {
22            tail = tail.next;
23            n++;
24        }
25
26        k = k % n;
27
28        if (k == 0) {
29            return head;
30        }
31
32        tail.next = head;
33
34        int steps = n - k - 1;
35
36        ListNode newTail = head;
37
38        for (int i = 0; i < steps; i++) {
39            newTail = newTail.next;
40        }
41
42        ListNode newHead = newTail.next;
43
44        newTail.next = null;
45
46        return newHead;
47    }
48}
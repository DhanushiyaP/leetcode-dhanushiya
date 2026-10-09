// Last updated: 10/9/2026, 10:32:50 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public ListNode sortList(ListNode head) {
16        if (head == null || head.next == null) {
17            return head;
18        }
19
20        ListNode slow = head;
21        ListNode fast = head;
22        ListNode prev = null;
23
24        while (fast != null && fast.next != null) {
25            prev = slow;
26            slow = slow.next;
27            fast = fast.next.next;
28        }
29
30        prev.next = null;
31
32        ListNode left = sortList(head);
33        ListNode right = sortList(slow);
34
35        return merge(left, right);
36    }
37
38    public ListNode merge(ListNode l1, ListNode l2) {
39        ListNode dummy = new ListNode(0);
40        ListNode curr = dummy;
41
42        while (l1 != null && l2 != null) {
43            if (l1.val <= l2.val) {
44                curr.next = l1;
45                l1 = l1.next;
46            } else {
47                curr.next = l2;
48                l2 = l2.next;
49            }
50            curr = curr.next;
51        }
52
53        if (l1 != null) {
54            curr.next = l1;
55        }
56
57        if (l2 != null) {
58            curr.next = l2;
59        }
60
61        return dummy.next;
62    }
63}
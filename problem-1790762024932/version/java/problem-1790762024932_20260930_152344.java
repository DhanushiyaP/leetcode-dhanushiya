// Last updated: 9/30/2026, 3:23:44 PM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13
14        if (lists.length == 0) {
15            return null;
16        }
17
18        ListNode result = null;
19
20        for (int i = 0; i < lists.length; i++) {
21            result = merge(result, lists[i]);
22        }
23
24        return result;
25    }
26
27    public ListNode merge(ListNode list1, ListNode list2) {
28
29        ListNode dummy = new ListNode(0);
30        ListNode current = dummy;
31
32        while (list1 != null && list2 != null) {
33
34            if (list1.val <= list2.val) {
35                current.next = list1;
36                list1 = list1.next;
37            } else {
38                current.next = list2;
39                list2 = list2.next;
40            }
41
42            current = current.next;
43        }
44
45        if (list1 != null) {
46            current.next = list1;
47        } else {
48            current.next = list2;
49        }
50
51        return dummy.next;
52    }
53}
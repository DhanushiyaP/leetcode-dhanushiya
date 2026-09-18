// Last updated: 9/18/2026, 10:26:16 PM
1/*!*/
2
3class Solution {
4    public boolean isNStraightHand(int[] hand, int groupSize) {
5
6        // Total cards must be divisible by groupSize
7        if (hand.length % groupSize != 0) {
8            return false;
9        }
10
11        // Store each card and its frequency
12        TreeMap<Integer, Integer> map = new TreeMap<>();
13
14        for (int i = 0; i < hand.length; i++) {
15            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
16        }
17
18        // Keep making groups
19        while (!map.isEmpty()) {
20
21            // Smallest card
22            int first = map.firstKey();
23
24            // Make a consecutive group
25            for (int i = 0; i < groupSize; i++) {
26
27                int card = first + i;
28
29                // Required card is missing
30                if (!map.containsKey(card)) {
31                    return false;
32                }
33
34                // Use one occurrence
35                map.put(card, map.get(card) - 1);
36
37                // Remove if no more occurrences
38                if (map.get(card) == 0) {
39                    map.remove(card);
40                }
41            }
42        }
43
44        return true;
45    }
46}
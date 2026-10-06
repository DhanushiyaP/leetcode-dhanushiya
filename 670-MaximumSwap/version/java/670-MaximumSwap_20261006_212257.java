// Last updated: 10/6/2026, 9:22:57 PM
1class Solution {
2    public int maximumSwap(int num) {
3        char[] arr = String.valueOf(num).toCharArray();
4
5        for (int i = 0; i < arr.length; i++) {
6            int max = i;
7
8            for (int j = i + 1; j < arr.length; j++) {
9                if (arr[j] >= arr[max]) {
10                    max = j;
11                }
12            }
13
14            if (arr[max] > arr[i]) {
15                char temp = arr[i];
16                arr[i] = arr[max];
17                arr[max] = temp;
18
19                break;
20            }
21        }
22
23        return Integer.parseInt(new String(arr));
24    }
25}
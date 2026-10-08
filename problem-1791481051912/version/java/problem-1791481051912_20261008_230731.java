// Last updated: 10/8/2026, 11:07:31 PM
1
2class Solution {
3    public String dayOfTheWeek(int day, int month, int year) {
4        String[] days = {
5            "Sunday", "Monday", "Tuesday", "Wednesday",
6            "Thursday", "Friday", "Saturday"
7        };
8
9        int total = 0;
10
11        for (int i = 1971; i < year; i++) {
12            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
13                total += 366;
14            } else {
15                total += 365;
16            }
17        }
18
19        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
20
21        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
22            months[1] = 29;
23        }
24
25        for (int i = 0; i < month - 1; i++) {
26            total += months[i];
27        }
28
29        total += day - 1;
30
31        return days[(total + 5) % 7];
32    }
33}
34
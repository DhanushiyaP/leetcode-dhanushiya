// Last updated: 10/8/2026, 11:00:18 PM
1
2class Solution {
3    public String complexNumberMultiply(String num1, String num2) {
4        String[] a = num1.split("\\+|i");
5        String[] b = num2.split("\\+|i");
6
7        int r1 = Integer.parseInt(a[0]);
8        int i1 = Integer.parseInt(a[1]);
9
10        int r2 = Integer.parseInt(b[0]);
11        int i2 = Integer.parseInt(b[1]);
12
13        int real = r1 * r2 - i1 * i2;
14        int imaginary = r1 * i2 + i1 * r2;
15
16        return real + "+" + imaginary + "i";
17    }
18}
19
// Last updated: 8/11/2026, 4:00:32 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        return Arrays.equals(ch,ch2);
    }
}
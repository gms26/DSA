// Last updated: 5/25/2026, 11:10:37 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1Array = s.toCharArray();
        char[] s2Array = t.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }
}
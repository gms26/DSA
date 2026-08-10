// Last updated: 8/10/2026, 12:12:13 PM
class Solution {
    public boolean hasMatch(String s, String p) {
        int x = p.indexOf('*');

        String a = p.substring(0, x);
        String b = p.substring(x + 1);

        int i = s.indexOf(a);

        if (i == -1)
            return false;

        return s.indexOf(b, i + a.length()) != -1;
    }
}
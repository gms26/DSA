// Last updated: 8/8/2026, 3:07:40 PM
1class Solution {
2    public boolean hasMatch(String s, String p) {
3        int x = p.indexOf('*');
4
5        String a = p.substring(0, x);
6        String b = p.substring(x + 1);
7
8        int i = s.indexOf(a);
9
10        if (i == -1)
11            return false;
12
13        return s.indexOf(b, i + a.length()) != -1;
14    }
15}
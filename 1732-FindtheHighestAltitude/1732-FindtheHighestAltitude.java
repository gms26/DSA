// Last updated: 6/22/2026, 9:30:32 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        HashMap<Character, Integer> h = new HashMap<>();
4
5        for (char c : text.toCharArray()) {
6            h.put(c, h.getOrDefault(c, 0) + 1);
7        }
8
9        int b = h.getOrDefault('b', 0);
10        int a = h.getOrDefault('a', 0);
11        int l = h.getOrDefault('l', 0) / 2;
12        int o = h.getOrDefault('o', 0) / 2;
13        int n = h.getOrDefault('n', 0);
14
15        return Math.min(Math.min(b, a),
16               Math.min(Math.min(l, o), n));
17    }
18}
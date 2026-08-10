// Last updated: 8/10/2026, 12:17:45 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : text.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        int b = h.getOrDefault('b', 0);
        int a = h.getOrDefault('a', 0);
        int l = h.getOrDefault('l', 0) / 2;
        int o = h.getOrDefault('o', 0) / 2;
        int n = h.getOrDefault('n', 0);

        return Math.min(Math.min(b, a),
               Math.min(Math.min(l, o), n));
    }
}
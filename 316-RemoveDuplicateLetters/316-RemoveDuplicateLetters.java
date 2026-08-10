// Last updated: 8/10/2026, 12:23:57 PM
class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] last = new int[26];
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (used[c - 'a']) {
                continue;
            }

            while (!st.isEmpty() &&
                   st.peek() > c &&
                   last[st.peek() - 'a'] > i) {
                used[st.pop() - 'a'] = false;
            }

            st.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}
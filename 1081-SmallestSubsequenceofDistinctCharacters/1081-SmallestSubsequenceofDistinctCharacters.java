// Last updated: 6/13/2026, 5:04:05 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        Stack<Character> st = new Stack<>();
4        int[] last = new int[26];
5        boolean[] used = new boolean[26];
6
7        for (int i = 0; i < s.length(); i++) {
8            last[s.charAt(i) - 'a'] = i;
9        }
10
11        for (int i = 0; i < s.length(); i++) {
12            char c = s.charAt(i);
13
14            if (used[c - 'a']) {
15                continue;
16            }
17
18            while (!st.isEmpty() &&
19                   st.peek() > c &&
20                   last[st.peek() - 'a'] > i) {
21                used[st.pop() - 'a'] = false;
22            }
23
24            st.push(c);
25            used[c - 'a'] = true;
26        }
27
28        StringBuilder ans = new StringBuilder();
29        for (char c : st) {
30            ans.append(c);
31        }
32
33        return ans.toString();
34    }
35}
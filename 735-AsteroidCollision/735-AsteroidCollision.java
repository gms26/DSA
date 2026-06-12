// Last updated: 6/12/2026, 11:33:08 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Character> st = new Stack<>();
4
5        for (char c : num.toCharArray()) {
6            while (!st.isEmpty() && k > 0 && st.peek() > c) {
7                st.pop();
8                k--;
9            }
10            st.push(c);
11        }
12
13        while (k > 0) {
14            st.pop();
15            k--;
16        }
17
18        StringBuilder sb = new StringBuilder();
19        while (!st.isEmpty()) {
20            sb.append(st.pop());
21        }
22
23        sb.reverse();
24
25        while (sb.length() > 1 && sb.charAt(0) == '0') {
26            sb.deleteCharAt(0);
27        }
28
29        return sb.length() == 0 ? "0" : sb.toString();
30    }
31}
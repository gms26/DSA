// Last updated: 6/12/2026, 6:24:29 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<String> st = new Stack<>();
4
5        for (char ch : s.toCharArray()) {
6            if (ch != ']') {
7                st.push(ch + "");
8            } else {
9                String str = "";
10                while (!st.peek().equals("[")) {
11                    str = st.pop() + str;
12                }
13                st.pop();
14
15                String num = "";
16                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
17                    num = st.pop() + num;
18                }
19
20                int k = Integer.parseInt(num);
21                String res = "";
22
23                while (k-- > 0) {
24                    res += str;
25                }
26
27                st.push(res);
28            }
29        }
30
31        String ans = "";
32        while (!st.isEmpty()) {
33            ans = st.pop() + ans;
34        }
35
36        return ans;
37    }
38}
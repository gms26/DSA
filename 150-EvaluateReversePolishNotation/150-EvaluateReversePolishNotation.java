// Last updated: 6/14/2026, 10:22:02 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (String token : tokens) {
6            if (token.equals("+")) {
7                int b = stack.pop();
8                int a = stack.pop();
9                stack.push(a + b);
10            } else if (token.equals("-")) {
11                int b = stack.pop();
12                int a = stack.pop();
13                stack.push(a - b);
14            } else if (token.equals("*")) {
15                int b = stack.pop();
16                int a = stack.pop();
17                stack.push(a * b);
18            } else if (token.equals("/")) {
19                int b = stack.pop();
20                int a = stack.pop();
21                stack.push(a / b);
22            } else {
23                stack.push(Integer.parseInt(token));
24            }
25        }
26
27        return stack.pop();
28    }
29}
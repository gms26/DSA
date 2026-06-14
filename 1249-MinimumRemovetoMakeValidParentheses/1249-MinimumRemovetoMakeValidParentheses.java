// Last updated: 6/14/2026, 8:01:31 PM
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        Stack<Integer> stack = new Stack<>();
4        char[] arr = s.toCharArray();
5
6        for (int i = 0; i < arr.length; i++) {
7            if (arr[i] == '(') {
8                stack.push(i);
9            } else if (arr[i] == ')') {
10                if (!stack.isEmpty()) {
11                    stack.pop();
12                } else {
13                    arr[i] = '#';
14                }
15            }
16        }
17
18        while (!stack.isEmpty()) {
19            arr[stack.pop()] = '#';
20        }
21
22        StringBuilder ans = new StringBuilder();
23
24        for (char ch : arr) {
25            if (ch != '#') {
26                ans.append(ch);
27            }
28        }
29
30        return ans.toString();
31    }
32}
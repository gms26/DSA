// Last updated: 6/12/2026, 10:36:17 PM
1import java.util.*;
2
3class Solution {
4    public int[] asteroidCollision(int[] asteroids) {
5        Stack<Integer> st = new Stack<>();
6
7        for (int i = 0; i < asteroids.length; i++) {
8            int curr = asteroids[i];
9
10            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
11                int top = st.peek();
12
13                if (top == -curr) {
14                    st.pop();
15                    curr = 0;
16                    break;
17                } else if (top > -curr) {
18                    curr = 0;
19                    break;
20                } else {
21                    st.pop();
22                }
23            }
24
25            if (curr != 0) {
26                st.push(curr);
27            }
28        }
29
30        int[] z = new int[st.size()];
31        for (int i = st.size() - 1; i >= 0; i--) {
32            z[i] = st.pop();
33        }
34
35        return z;
36    }
37}
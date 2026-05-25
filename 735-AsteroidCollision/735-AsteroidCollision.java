// Last updated: 5/25/2026, 11:08:32 AM
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                int top = st.peek();

                if (top == -curr) {
                    st.pop();
                    curr = 0;
                    break;
                } else if (top > -curr) {
                    curr = 0;
                    break;
                } else {
                    st.pop();
                }
            }

            if (curr != 0) {
                st.push(curr);
            }
        }

        int[] z = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            z[i] = st.pop();
        }

        return z;
    }
}
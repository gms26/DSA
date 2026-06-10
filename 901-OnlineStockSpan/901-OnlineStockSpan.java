// Last updated: 6/10/2026, 11:20:23 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int maxArea = 0;
5        int n = heights.length;
6        for (int i = 0; i <= n; i++) {
7            int currHeight;
8            if (i == n)
9                currHeight = 0;
10            else
11                currHeight = heights[i];
12            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
13                int height = heights[stack.pop()];
14
15                int width;
16                if (stack.isEmpty())
17                    width = i;
18                else
19                    width = i - stack.peek() - 1;
20                maxArea = Math.max(maxArea, height * width);
21            }
22            stack.push(i);
23        }
24        return maxArea;
25    }
26}
27
// Last updated: 6/9/2026, 9:50:10 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] res = new int[n];
5        Stack<Integer> stack = new Stack<>(); 
6
7        for (int i = 0; i < n; i++) {
8            
9            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
10                int prevIndex = stack.pop();
11                res[prevIndex] = i - prevIndex;
12            }
13            stack.push(i); 
14        }
15
16        return res;
17    }
18}
19
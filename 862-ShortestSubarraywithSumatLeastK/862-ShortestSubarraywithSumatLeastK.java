// Last updated: 6/15/2026, 10:42:50 PM
1import java.util.*;
2
3class Solution {
4    public int shortestSubarray(int[] nums, int k) {
5        int n = nums.length;
6
7        long[] prefix = new long[n + 1];
8        for (int i = 0; i < n; i++) {
9            prefix[i + 1] = prefix[i] + nums[i];
10        }
11
12        Deque<Integer> dq = new ArrayDeque<>();
13        int ans = n + 1;
14
15        for (int i = 0; i <= n; i++) {
16
17            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) {
18                ans = Math.min(ans, i - dq.pollFirst());
19            }
20
21            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]) {
22                dq.pollLast();
23            }
24
25            dq.offerLast(i);
26        }
27
28        return ans == n + 1 ? -1 : ans;
29    }
30}
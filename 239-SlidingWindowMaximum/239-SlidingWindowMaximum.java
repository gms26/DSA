// Last updated: 6/15/2026, 9:43:31 PM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        int[] ans = new int[n - k + 1];
7
8        Deque<Integer> dq = new ArrayDeque<>();
9        int idx = 0;
10
11        for (int i = 0; i < n; i++) {
12
13           
14            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
15                dq.pollFirst();
16            }
17
18           
19            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
20                dq.pollLast();
21            }
22
23           
24            dq.addLast(i);
25
26            
27            if (i >= k - 1) {
28                ans[idx++] = nums[dq.peekFirst()];
29            }
30        }
31
32        return ans;
33    }
34}
35
// Last updated: 5/25/2026, 11:10:05 AM
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int key : freq.keySet()) {
            pq.add(new int[]{key, freq.get(key)});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll()[0];
        }

        return ans;
    }
}

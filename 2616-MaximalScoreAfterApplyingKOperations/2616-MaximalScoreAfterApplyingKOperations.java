// Last updated: 5/25/2026, 11:04:12 AM
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int x : nums) {
            pq.offer(x);
        }

        long score = 0;

        while (k-- > 0) {
            int x = pq.poll();
            score += x;

            int next = (x + 2) / 3;
            pq.offer(next);
        }

        return score;
    }
}
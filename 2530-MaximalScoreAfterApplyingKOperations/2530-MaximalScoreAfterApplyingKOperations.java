// Last updated: 9/28/2026, 10:28:35 PM
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
// Last updated: 5/25/2026, 11:03:02 AM
import java.util.*;

class Solution {

    static class Node {
        Node[] next = new Node[2];
        int count = 0;
    }

    Node root = new Node();

    void insert(int x) {
        Node cur = root;
        for (int i = 30; i >= 0; i--) {
            int b = (x >> i) & 1;
            if (cur.next[b] == null) cur.next[b] = new Node();
            cur = cur.next[b];
            cur.count++;
        }
    }

    void remove(int x) {
        Node cur = root;
        for (int i = 30; i >= 0; i--) {
            int b = (x >> i) & 1;
            cur = cur.next[b];
            cur.count--;
        }
    }

    int queryMaxXor(int x) {
        Node cur = root;
        int ans = 0;

        for (int i = 30; i >= 0; i--) {
            int b = (x >> i) & 1;
            int want = 1 - b;

            if (cur.next[want] != null && cur.next[want].count > 0) {
                ans |= (1 << i);
                cur = cur.next[want];
            } else {
                cur = cur.next[b];
            }
        }

        return ans;
    }

    // LeetCode required function
    public int maxXor(int[] nums, int k) {
        int n = nums.length;

        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] ^ nums[i];
        }

        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int l = 0, ans = 0;

        insert(pref[0]);

        for (int r = 0; r < n; r++) {

            while (!maxD.isEmpty() && nums[maxD.peekLast()] <= nums[r]) {
                maxD.pollLast();
            }
            maxD.addLast(r);

            while (!minD.isEmpty() && nums[minD.peekLast()] >= nums[r]) {
                minD.pollLast();
            }
            minD.addLast(r);

            while (nums[maxD.peekFirst()] - nums[minD.peekFirst()] > k) {
                remove(pref[l]);

                if (maxD.peekFirst() == l) maxD.pollFirst();
                if (minD.peekFirst() == l) minD.pollFirst();

                l++;
            }

            ans = Math.max(ans, queryMaxXor(pref[r + 1]));
            insert(pref[r + 1]);
        }

        return ans;
    }
}

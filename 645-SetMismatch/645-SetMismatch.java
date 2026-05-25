// Last updated: 5/25/2026, 11:08:45 AM
class Solution {
    public int[] findErrorNums(int[] n) {
        int[] a = new int[2];
        int[] count = new int[n.length + 1];

        for (int x : n) {
            count[x]++;
        }

        for (int i = 1; i <= n.length; i++) {
            if (count[i] == 2) {
                a[0] = i; 
            } else if (count[i] == 0) {
                a[1] = i; 
            }
        }

        return a;
    }
}

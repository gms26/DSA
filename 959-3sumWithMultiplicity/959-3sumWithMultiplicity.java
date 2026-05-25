// Last updated: 5/25/2026, 11:07:43 AM
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long MOD = 1_000_000_007;

        Map<Integer, Long> freq = new HashMap<>();
        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0L) + 1);

        List<Integer> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys);

        long count = 0;

        for (int i = 0; i < keys.size(); i++) {
            for (int j = i; j < keys.size(); j++) {

                int a = keys.get(i);
                int b = keys.get(j);
                int c = target - a - b;

                if (c < b || !freq.containsKey(c)) continue;

                long fa = freq.get(a);
                long fb = freq.get(b);
                long fc = freq.get(c);

                if (a == b && b == c)
                    count += fa * (fa - 1) * (fa - 2) / 6;
                else if (a == b)
                    count += fa * (fa - 1) / 2 * fc;
                else if (b == c)
                    count += fb * (fb - 1) / 2 * fa;
                else
                    count += fa * fb * fc;
            }
        }
        return (int)(count % MOD);
    }
}

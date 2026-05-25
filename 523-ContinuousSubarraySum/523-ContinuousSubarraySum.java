// Last updated: 5/25/2026, 11:09:06 AM
class Solution {
    public boolean checkSubarraySum(int[] n, int k) {
        
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1); 

        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            int mod;

            
            if (k != 0) {
                mod = sum % k;
            } else {
                mod = sum;
            }

            if (m.containsKey(mod)) {
                if (i - m.get(mod) > 1) return true;
            } else {
                m.put(mod, i);
            }
        }

        return false;
    }
}
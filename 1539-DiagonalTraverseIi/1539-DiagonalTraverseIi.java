// Last updated: 5/25/2026, 11:06:15 AM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
         Map<Integer, List<Integer>> map = new HashMap<>();
        int total = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int key = i + j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(nums.get(i).get(j));
                total++;
            }
        }

        int[] res = new int[total];
        int idx = 0;

        for (int d = 0; map.containsKey(d); d++) {
            for (int val : map.get(d)) {
                res[idx++] = val;
            }
        }

        return res;
    }
}
// Last updated: 5/25/2026, 11:08:18 AM
class Solution {
    public int numRabbits(int[] answers) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int a : answers) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int result = 0;

        for (int x : map.keySet()) {
            int count = map.get(x);
            int groupSize = x + 1;

            int groups = (count + groupSize - 1) / groupSize; 
            result += groups * groupSize;
        }

        return result;
    }
}
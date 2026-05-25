// Last updated: 5/25/2026, 11:08:22 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int count = 0;

        for (char stone : stones.toCharArray()) {
            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    count++;
                    break;
                }
            }
        }

        return count; 
    }
}
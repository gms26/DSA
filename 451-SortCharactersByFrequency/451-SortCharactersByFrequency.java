// Last updated: 5/25/2026, 11:09:28 AM
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];  

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

       
        for (int f = s.length(); f > 0; f--) {
            for (int i = 0; i < 256; i++) {
                if (freq[i] == f) {
                    for (int j = 0; j < f; j++) {
                        sb.append((char) i);
                    }
                }
            }
        }

        return sb.toString();
    }
}
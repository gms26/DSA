// Last updated: 5/25/2026, 11:04:56 AM
import java.util.*;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> freq1 = new HashMap<>();
        Map<String, Integer> freq2 = new HashMap<>();
        
        for (String w : words1) {
            freq1.put(w, freq1.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            freq2.put(w, freq2.getOrDefault(w, 0) + 1);
        }
        
        int count = 0;
        for (String word : freq1.keySet()) {
            if (freq1.get(word) == 1 && freq2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        
        return count;
    }
}

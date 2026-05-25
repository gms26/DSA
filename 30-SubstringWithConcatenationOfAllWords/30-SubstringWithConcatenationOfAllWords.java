// Last updated: 5/25/2026, 11:13:23 AM
import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) return ans;

        int wordLen = words[0].length();
        int wordCount = words.length;

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            int count = 0;

            Map<String, Integer> seen = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (!freq.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right;
                } 
                else {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    while (seen.get(word) > freq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount) {
                        ans.add(left);

                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                }
            }
        }

        return ans;
    }
}

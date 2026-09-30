// Last updated: 9/30/2026, 9:53:43 AM
import java.util.*;

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < messages.length; i++) {
            String sender = senders[i];
            int wordCount = messages[i].split(" ").length; 

            map.put(sender, map.getOrDefault(sender, 0) + wordCount);
        }

        String result = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String sender = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && sender.compareTo(result) > 0)) {
                maxCount = count;
                result = sender;
            }
        }

        return result;
    }
}

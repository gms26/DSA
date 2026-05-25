// Last updated: 5/25/2026, 11:04:46 AM
import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] n) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        // Split based on INDEX parity
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                even.add(n[i]);
            } else {
                odd.add(n[i]);
            }
        }
        
        // Sort even ascending, odd descending
        Collections.sort(even);
        odd.sort(Collections.reverseOrder());
        
        // Merge back into original array
        int e = 0, o = 0;
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                n[i] = even.get(e++);
            } else {
                n[i] = odd.get(o++);
            }
        }
        
        return n;
    }
}

// Last updated: 5/25/2026, 11:07:05 AM
import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int k = 0;
        
        // Step 1: Add elements of arr1 that appear in arr2 in arr2 order
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result[k++] = arr1[j];
                }
            }
        }
        
        // Step 2: Collect leftover elements not in arr2
        int[] leftovers = new int[arr1.length - k];
        int idx = 0;
        for (int j = 0; j < arr1.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                leftovers[idx++] = arr1[j];
            }
        }
        
        Arrays.sort(leftovers);
        
        for (int i = 0; i < leftovers.length; i++) {
            result[k++] = leftovers[i];
        }
        
        return result;
    }
}

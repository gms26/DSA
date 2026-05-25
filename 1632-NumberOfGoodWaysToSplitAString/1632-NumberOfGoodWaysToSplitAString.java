// Last updated: 5/25/2026, 11:06:00 AM
class Solution {
    public int numSplits(String s) {
    int n = s.length();
    int[] left = new int[n];
    int[] right = new int[n];

    boolean[] seen = new boolean[26];
    int count = 0;

    
    for(int i = 0; i < n; i++) {
        int j=s.charAt(i) - 'a';
        if(!seen[j]) {
            seen[j] = true;
            count++;
        }
        left[i] = count;
    }

    
    seen = new boolean[26];
    count = 0;

    
    for (int i = n - 1; i >= 0; i--) {
        int j=s.charAt(i) - 'a';
        if (!seen[j]) {
            seen[j] = true;
            count++;
        }
        right[i] = count;
    }

    int ans = 0;
    for (int i = 0; i < n - 1; i++) {
        if (left[i] == right[i + 1]) {
            ans++;
        }
    }

    return ans;
}

}
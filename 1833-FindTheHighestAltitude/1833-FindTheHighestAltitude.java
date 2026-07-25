// Last updated: 7/25/2026, 10:18:34 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int s=0;
        int m=0;
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            System.out.println(s);
            m=Math.max(m,s);
        }
        return m;
    }
}
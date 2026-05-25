// Last updated: 5/25/2026, 11:06:16 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int s=0;
      for(int i=0;i<k;i++){
        s+=cardPoints[i];
      }  
      int m=s;
      for(int i=0;i<k;i++){
        s=s-cardPoints[k-i-1]+cardPoints[cardPoints.length-i-1];
        if(m<s)m=s;
      }
      return m;
    }
}
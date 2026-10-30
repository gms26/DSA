// Last updated: 10/30/2026, 3:56:40 PM
1class Solution {
2    public int hIndex(int[] c) {
3        Arrays.sort(c);
4        for(int i=0;i<c.length;i++){
5            int h=c.length-i;
6            if(c[i]>=h)return h;
7        }
8        return 0;
9    }
10}
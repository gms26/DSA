// Last updated: 5/25/2026, 11:08:53 AM
class Solution {
    public int distributeCandies(int[] c) {
        int a=c.length;
        HashSet<Integer> s=new HashSet<>();
        for(int type:c){
           s.add(type);
        }
        int m=a/2;
        return Math.min(s.size(),m);
    }
}
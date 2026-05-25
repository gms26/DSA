// Last updated: 5/25/2026, 11:05:58 AM
class Solution {
    public int numIdenticalPairs(int[] n) {
        HashMap<Integer,Integer> f=new HashMap<>();
        int c=0;
        for(int i:n){
            c+=f.getOrDefault(i,0);
            f.put(i,f.getOrDefault(i,0)+1);
        }
        return c;
    }
}
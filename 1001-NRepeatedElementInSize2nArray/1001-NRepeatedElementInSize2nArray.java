// Last updated: 5/25/2026, 11:07:36 AM
class Solution {
    public int repeatedNTimes(int[] n) {
        HashMap<Integer,Integer> r=new HashMap<>();
        for(int i:n){
            r.put(i,r.getOrDefault(i,0)+1);
        }
        int a=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> j:r.entrySet()){
            a=Math.max(j.getValue(),a);
        }
        for(Map.Entry<Integer,Integer> j:r.entrySet()){
            if(j.getValue()==a){
                return j.getKey();
            }
        }
        return 0;
    }
}
// Last updated: 5/25/2026, 11:06:43 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i:arr){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        HashSet<Integer> f=new HashSet<>();
        for(Map.Entry<Integer,Integer> i:s.entrySet()){
            f.add(i.getValue());
        }
        return s.size()==f.size();
    }
}
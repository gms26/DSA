// Last updated: 5/25/2026, 11:03:00 AM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i:bulbs){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int j:s.keySet()){
            if(s.get(j)%2==1){
                a.add(j);
            }
        }
        Collections.sort(a);
        return a;
    }
}
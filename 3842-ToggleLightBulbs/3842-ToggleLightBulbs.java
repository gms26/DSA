// Last updated: 9/28/2026, 10:24:01 PM
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
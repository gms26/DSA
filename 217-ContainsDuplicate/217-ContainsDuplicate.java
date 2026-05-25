// Last updated: 5/25/2026, 11:10:59 AM
class Solution {
    public boolean containsDuplicate(int[] n) {
        int a=n.length;
        Set <Integer> s=new HashSet<>();
        for (int i=0;i<a;i++){
            if(s.contains(n[i])){
              return true;
            }
            else
            s.add(n[i]);

        }return false;
    }
}
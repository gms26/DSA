// Last updated: 5/25/2026, 11:05:30 AM
class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> a=new ArrayList<>();
      for(int i=0;i<s.length();i++){
        char b=s.charAt(i);
        if(Character.isDigit(b)){
            a.add(b-'0');
        }
      }  
      if(a.size()==0)return -1;
      HashSet<Integer> c=new HashSet<>(a);
      a=new ArrayList<>(c);
      Collections.sort(a);
      if(a.size()<2)return -1;
      return a.get(a.size()-2);
    }
}
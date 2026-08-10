// Last updated: 8/10/2026, 12:21:39 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>h=new HashMap<>();
        int c=0;
        for(char ch:s1.toCharArray()){
            if(!h.containsKey(ch))c++;
            h.put(ch,h.getOrDefault(ch,0)+1);
            
        }
        
       int z1=s1.length();
        for(int i=0;i+z1<=s2.length();i++){
          
            HashMap<Character,Integer>h1=new HashMap<>();
            //ArrayList<Character>ar=new ArrayList<>();
            
            
            for(int j=i;j<z1+i;j++){
                char ch=s2.charAt(j);
                h1.put(ch,h1.getOrDefault(ch,0)+1);
            }
            if(h.equals(h1))return true;
            
        }    
      return false;

    }
}
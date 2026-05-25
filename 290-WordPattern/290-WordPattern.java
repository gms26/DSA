// Last updated: 5/25/2026, 11:10:23 AM
class Solution {
    public boolean wordPattern(String p, String s) {
        String[] a = s.split(" ");
        if (p.length() != a.length) return false;
        
        HashMap<Object, Integer> b = new HashMap<>();
        
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);  
            String w = a[i];      

           
            if (!Objects.equals(b.put(c, i), b.put(w, i))){ 
                return false;}
        }
        return true;
    }
}

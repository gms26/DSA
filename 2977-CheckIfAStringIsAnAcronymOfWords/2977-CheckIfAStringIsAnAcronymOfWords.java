// Last updated: 5/25/2026, 11:03:46 AM
class Solution {
    public boolean isAcronym(List<String> w, String s) {
        if(w.size()!=s.length())return false;
        boolean c=false;
        int z=0;
        for(int i=0;i<w.size();i++){
            int a=w.get(i).charAt(0);
            int b=s.charAt(i);
            if(a==b){
                z++;
            }
        }
        if(z==w.size()){return true;}
        else{
            return false;
        }
    }
}
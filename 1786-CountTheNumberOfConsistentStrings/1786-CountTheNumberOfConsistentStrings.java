// Last updated: 7/25/2026, 10:18:38 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character>a=new ArrayList<>();
        for(char c:allowed.toCharArray()){
            a.add(c);

        }
        int c=0;
        
        for(String i:words){
            boolean f=true;
            for(int j=0;j<i.length();j++){
                if(!a.contains(i.charAt(j))){f=false;break;}
                
            }
            if(f)c++;
        }
        return c;
    }
}
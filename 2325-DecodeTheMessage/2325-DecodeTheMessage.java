// Last updated: 9/30/2026, 9:53:16 AM
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>a=new HashMap<>();
        int z=0;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c==' ')continue;
            if(!a.containsKey(c)){
                a.put(c,(char)('a'+z));
                z++;
            }
        }
        String s="";
        
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c==' '){s+=" ";continue;}
            s+=a.get(c);
            
            
        }
        return s;
    }
}
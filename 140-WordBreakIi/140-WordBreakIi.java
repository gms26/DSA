// Last updated: 5/25/2026, 11:11:44 AM
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> a=new HashSet<>(wordDict);
        Map<String,List<String>>m=new HashMap<>();
        return back(s,a,m);
    }
    List<String> back(String s,Set<String>n,Map<String,List<String>>m){
        if(m.containsKey(s)){
            return m.get(s);
        }
        List<String> a=new ArrayList<>();
        if(s.length()==0){
            a.add("");
            return a;
        }
        for(String w:n){
            if(s.startsWith(w)){
                List<String> z= back(s.substring(w.length()),n,m);
                for(String str:z){
                    if(str.equals("")){
                        a.add(w);
                    }
                    else{
                        a.add(w+" "+str);
                    }
                }
            }
        }
        m.put(s,a);
        return a;
    }
}
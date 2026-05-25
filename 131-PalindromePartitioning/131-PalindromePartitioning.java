// Last updated: 5/25/2026, 11:11:52 AM
class Solution {
    void back(List<List<String>>r,int z,List<String>a,String s){
        if(z==s.length()){
            r.add(new ArrayList<>(a));
            return;
        }
        for(int end=z;end<s.length();end++){
            if(ispalin(s,z,end)){
                a.add(s.substring(z,end+1));
                back(r,end+1,a,s);
                a.remove(a.size()-1);
            }
        }
    }
    boolean ispalin(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>r=new ArrayList<>();
        back(r,0,new ArrayList<>(),s);
        return r;
    }
}
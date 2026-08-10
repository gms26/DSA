// Last updated: 8/10/2026, 12:27:06 PM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>a=new ArrayList<>();
        back(s,0,new ArrayList<>(),a);
        return a;
    }
    void back(String s,int i,List<String>path,List<String>a){
        if(path.size()==4){
            if(i==s.length()){
                a.add(String.join(".",path));
            }
            return ;
        }
        for(int l=1;l<=3;l++){
            if(i+l>s.length())break;
            String p=s.substring(i,i+l);
            if(p.length()>1 && p.charAt(0)=='0')continue;
            int z=Integer.parseInt(p);
            if(z<=255){
                path.add(p);
                back(s,i+l,path,a);
                path.remove(path.size()-1);
            }
        }
    }

}
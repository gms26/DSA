// Last updated: 6/5/2026, 10:04:46 AM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String>a=new ArrayList<>();
4        back(s,0,new ArrayList<>(),a);
5        return a;
6    }
7    void back(String s,int i,List<String>path,List<String>a){
8        if(path.size()==4){
9            if(i==s.length()){
10                a.add(String.join(".",path));
11            }
12            return ;
13        }
14        for(int l=1;l<=3;l++){
15            if(i+l>s.length())break;
16            String p=s.substring(i,i+l);
17            if(p.length()>1 && p.charAt(0)=='0')continue;
18            int z=Integer.parseInt(p);
19            if(z<=255){
20                path.add(p);
21                back(s,i+l,path,a);
22                path.remove(path.size()-1);
23            }
24        }
25    }
26
27}
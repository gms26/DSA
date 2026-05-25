// Last updated: 5/25/2026, 11:13:38 AM
class Solution {
    public List<String> letterCombinations(String d) {
        String[] m={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> result=new ArrayList<>();
        if(d==null||d.length()==0){
            return result;
        }
        result.add("");
        for(char i:d.toCharArray()){
            String l=m[i-'0'];
            ArrayList<String> n=new ArrayList<>();
            for(String j:result){
                for(char k:l.toCharArray()){
                    n.add(j+k);
                }
            }
            result=n;
        }
        return result;
    }
}
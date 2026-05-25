// Last updated: 5/25/2026, 11:07:53 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> a=new HashMap<>();
        String[]b=s1.split(" ");
        String[]c=s2.split(" ");
        for(String i:b){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(String i:c){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int s=0;
        for(Map.Entry<String,Integer> j:a.entrySet()){
            if(j.getValue()==1){
                s++;
            }
        }
        String []r=new String[s];
        int k=0;
        for(Map.Entry<String,Integer> j:a.entrySet()){
            if(j.getValue()==1){
                r[k++]=j.getKey();
            }
        }
        return r;
    }
}
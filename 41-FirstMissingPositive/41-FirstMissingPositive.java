// Last updated: 5/25/2026, 11:13:14 AM
class Solution {
    public int firstMissingPositive(int[] n) {
     HashSet<Integer> a=new HashSet<>();   
    for(int i:n){
        if(i>0){
            a.add(i);
        }
    }
    int s=1;
    while(true){
        if(!a.contains(s)){
            return s;
        }
        s++;
    }

    }
}
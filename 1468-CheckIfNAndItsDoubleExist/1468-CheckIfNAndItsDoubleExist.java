// Last updated: 5/25/2026, 11:06:25 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:arr){
            if(s.contains(2*i) || (i%2==0 && s.contains(i/2))){
                return true;
            }
            s.add(i);
        }
        return false;
    }
}
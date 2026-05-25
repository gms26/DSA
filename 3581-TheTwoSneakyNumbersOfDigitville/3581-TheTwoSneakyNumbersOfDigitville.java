// Last updated: 5/25/2026, 11:03:19 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
     HashMap<Integer,Integer>a=new HashMap<>();
     for(int n:nums){
        a.put(n,a.getOrDefault(n,0)+1);
     }   
     int z[]=new int[2];
     int m=0;
     for(Map.Entry<Integer,Integer>i:a.entrySet()){
       if( i.getValue()==2 && m!=2){
        z[m++]=i.getKey();
       }
     }
     return z;
    }
}
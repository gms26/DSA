// Last updated: 5/25/2026, 11:06:01 AM
class Solution {
    public boolean canArrange(int[] arr, int k) {
        boolean f=true;
        ArrayList<Integer>s1=new ArrayList<>();
        ArrayList<Integer>s2=new ArrayList<>();
        
        
        for(int i=0;i<arr.length;i++){
            int r=((arr[i]%k)+k)%k;
            if(r==0){
                s1.add(r);
            }
            else{
                s2.add(r);
            }
        }
        if(s1.size()%2!=0)return false;
        Collections.sort(s2);
        int i=0,j=s2.size()-1;
        while(i<s2.size() && j>-1){
            if(s2.get(i)+s2.get(j)!=k){return false;}
            i++;j--;
        }
        return f;
    }
}
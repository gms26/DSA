// Last updated: 8/10/2026, 12:19:40 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int a=0,i=0,j=0;
        // for(int i=0;i<fruits.length;i++){
             Map<Integer,Integer>m=new HashMap<>();
        //     for(int j=i;j<fruits.length;j++){
        //         m.put(fruits[j],m.getOrDefault(fruits[j],0)+1);
        //         if(m.size()>2)break;
        //         a=Math.max(a,j-i+1);
        //     }
        // }
        while(j<fruits.length){
            m.put(fruits[j],m.getOrDefault(fruits[j],0)+1);
            while(m.size()>2){
                m.put(fruits[i],m.get(fruits[i])-1);
                if(m.get(fruits[i])==0)m.remove(fruits[i]);
                i++;
            }
            a=Math.max(a,j-i+1);
            j++;
        }
        return a;
    }
}
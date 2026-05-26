// Last updated: 5/26/2026, 11:00:01 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int a=0,i=0,j=0;
4        // for(int i=0;i<fruits.length;i++){
5             Map<Integer,Integer>m=new HashMap<>();
6        //     for(int j=i;j<fruits.length;j++){
7        //         m.put(fruits[j],m.getOrDefault(fruits[j],0)+1);
8        //         if(m.size()>2)break;
9        //         a=Math.max(a,j-i+1);
10        //     }
11        // }
12        while(j<fruits.length){
13            m.put(fruits[j],m.getOrDefault(fruits[j],0)+1);
14            while(m.size()>2){
15                m.put(fruits[i],m.get(fruits[i])-1);
16                if(m.get(fruits[i])==0)m.remove(fruits[i]);
17                i++;
18            }
19            a=Math.max(a,j-i+1);
20            j++;
21        }
22        return a;
23    }
24}
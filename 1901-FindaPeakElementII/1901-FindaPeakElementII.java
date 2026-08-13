// Last updated: 8/13/2026, 9:25:03 PM
1class Solution {
2    public int maximumPopulation(int[][] l) {
3        int z=0;
4        int m=0;
5        for(int i=1950;i<=2050;i++){
6            
7            int c=0;
8            for(int j=0;j<l.length;j++){
9                
10                    if(i>=l[j][0] && l[j][1]>i){
11                        c++;
12                    }
13                
14                
15            }
16            if(c>m){
17                    m=c;
18                    z=i;
19                }
20        }
21        return z;
22    }
23}
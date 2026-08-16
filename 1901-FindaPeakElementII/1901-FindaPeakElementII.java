// Last updated: 8/16/2026, 5:52:26 PM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3     int m=mat.length;
4     int n=mat[0].length;
5     int[][]a=new int[m][n];
6     int z=m-1;
7     boolean f=true;
8      for(int i=0;i<m;i++){ //1
9        for(int j=0;j<n;j++){
10            if(mat[i][j]!=target[i][j]){
11                f= false;
12            }
13          
14        }
15      
16     }
17     if(f)return f;
18     f=true;
19     for(int i=0;i<m;i++){ //2
20        for(int j=0;j<n;j++){
21            a[j][n-i-1]=mat[i][j];
22        }
23        
24     }
25 for(int i=0;i<m;i++){
26        for(int j=0;j<n;j++){
27            if(a[i][j]!=target[i][j]){
28                f= false;
29            }
30          
31        }
32      
33     }
34     if(f)return f;
35     f=true;
36for(int i=0;i<m;i++){ //3
37        for(int j=0;j<n;j++){
38            a[i][j]=mat[m-i-1][n-j-1];
39        }
40     }
41 for(int i=0;i<m;i++){
42        for(int j=0;j<n;j++){
43            if(a[i][j]!=target[i][j]){
44                f= false;
45            }
46          
47        }
48      
49     }
50    if(f)return f;
51    f=true;
52    for(int i=0;i<m;i++){ //4
53        for(int j=0;j<n;j++){
54            mat[i][j]=a[n-j-1][i];
55        }
56     }
57 for(int i=0;i<m;i++){
58        for(int j=0;j<n;j++){
59            if(mat[i][j]!=target[i][j]){
60                f= false;
61            }
62          
63        }
64      
65     }
66     if(f)return true;
67     return false;
68    }
69}
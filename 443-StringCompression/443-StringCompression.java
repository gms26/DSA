// Last updated: 6/4/2026, 11:19:11 PM
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        int i = 0, j = 0, c = 0;
4        boolean z = true;
5        int[] a = new int[mat.length * mat[0].length];
6        while (c< mat.length * mat[0].length) {
7            a[c++] = mat[i][j];
8            if (z==true) {
9                i--;
10                j++;
11                if (j >= mat[0].length) {
12                    i += 2;
13                    j--;
14                    z = false;
15                } else if (i < 0) {
16                    i++;
17                    z = false;
18                }
19            }
20            else{
21                i++;j--;
22                if(i>=mat.length){
23                    j+=2;
24                    i--;
25                    z=true;
26                }
27                else if(j<0){
28                    j++;
29                    z=true;
30                }
31            }
32        }
33        return a;
34    }
35}